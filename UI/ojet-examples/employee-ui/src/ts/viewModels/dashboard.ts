/**
 * @license
 * Copyright (c) 2014, 2024, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
import * as AccUtils from "../accUtils";
import 'ojs/ojtable';
import { RESTDataProvider } from 'ojs/ojrestdataprovider';

// type to specify the datastructur of the data
type D = {id: number, name : string, dob : Date}
type K = D['id'];
class DashboardViewModel {
  readonly keyAttributes = 'id';
  readonly dataprovider : RESTDataProvider<K, D>;
  // initialize the dataprovider to get the json data from the employee api
  constructor() {
    this.dataprovider = new RESTDataProvider({
      keyAttributes : this.keyAttributes,
      url : 'http://localhost:9090/web-case-study/webapi/v1/employee/findAll',
      transforms : {
        fetchFirst : {
          request : async (options) => {
            const url = new URL(options.url);
            return new Request(url.href);
          },
          response : async ({body}) => {
            let data = body;
            return {data} // {id, name, dob}
          }
        }
      }
    });
  }
}

export = DashboardViewModel;
