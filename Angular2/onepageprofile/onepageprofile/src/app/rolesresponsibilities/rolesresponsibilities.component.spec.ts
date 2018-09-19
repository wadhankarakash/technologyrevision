import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RolesresponsibilitiesComponent } from './rolesresponsibilities.component';

describe('RolesresponsibilitiesComponent', () => {
  let component: RolesresponsibilitiesComponent;
  let fixture: ComponentFixture<RolesresponsibilitiesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RolesresponsibilitiesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RolesresponsibilitiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
