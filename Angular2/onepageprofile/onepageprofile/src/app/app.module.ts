import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule, MatCardModule, MatMenuModule, MatToolbarModule, MatIconModule,
   MatExpansionModule, MatGridListModule} from '@angular/material';
import 'hammerjs';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component'
import { IntroductionComponent } from './introduction/introduction.component';
import { TechnologiesComponent } from './technologies/technologies.component';
import { RolesresponsibilitiesComponent } from './rolesresponsibilities/rolesresponsibilities.component';
import { FooterComponent } from './footer/footer.component'

@NgModule({
  declarations: [
    AppComponent,
  HeaderComponent,
  IntroductionComponent,
  TechnologiesComponent,
  RolesresponsibilitiesComponent,
  FooterComponent
  
  ],
  imports: [
    BrowserModule,
  BrowserAnimationsModule,
  MatButtonModule,
  MatCardModule,
  MatMenuModule,
  MatToolbarModule,
  MatIconModule,
  MatExpansionModule,
  MatGridListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
