import { AfterViewInit, Component, ViewChild } from '@angular/core';
import { Child1Component } from './child1/child1.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements AfterViewInit {
  parentName = "Raj Patil";

  @ViewChild(Child1Component)
  chiuldRef?:Child1Component;

  ngOnInit(){
    if(this.childRef?!=null){
      this.cAge=this.chiuldRef.childRef.childAge;
    }
  }
}
