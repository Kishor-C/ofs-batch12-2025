
import * as ko from 'knockout';
import 'oj-c/input-text';
import 'oj-c/input-password';
  
import 'ojs/ojknockout';
import 'oj-c/form-layout';
import "oj-c/button";
import rootViewModel from  '../appController';
class LoginViewModel {
    username : ko.Observable<string>;
    password : ko.Observable<string>;
    errorMessage : ko.Observable<string>;
    constructor() {
        this.username = ko.observable("");
        this.password = ko.observable("");
        this.errorMessage = ko.observable("");
    }
    public loginAction = (event:Event) => {
        // checking with some dummy values
        if(this.username() == 'Admin' && this.password() == '12345') {
            rootViewModel.router?.go({path:'dashboard'});
        } else {
            this.errorMessage('User or password is incorrect');
            this.username(""); 
            this.password("");
        }   
    }
}

export = LoginViewModel;