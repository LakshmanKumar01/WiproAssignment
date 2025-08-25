import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MusicappComponent } from './musicapp.component';

describe('MusicappComponent', () => {
  let component: MusicappComponent;
  let fixture: ComponentFixture<MusicappComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MusicappComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MusicappComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
