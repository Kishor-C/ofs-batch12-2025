/**
 * @license
 * Copyright (c) 2014, 2024, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */


import * as ko from "knockout";
import * as Bootstrap from "ojs/ojbootstrap";
import "oj-c/input-text";
  import "oj-c/button";
import "ojs/ojknockout";

  
class DashboardViewModel {
  // declaring a firstname variable of observable<string>
  firstname : ko.Observable<string>; //Observable 'O' is in uppercase
  isDisabled : ko.Observable<boolean>;
  constructor() {
    this.firstname = ko.observable("Guest");//observable 'o' is in lowercase
    this.isDisabled = ko.observable(true);
  }
  public validateInput = (event: Event) => {
    if(this.firstname().length <= 3) {
      this.isDisabled(true);
    } else {
      this.isDisabled(false);
    }
  }
  public buttonAction = (event: Event) => {
    alert('button clicked, name = '+this.firstname());
  }
}

export = DashboardViewModel;
