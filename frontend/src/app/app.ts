import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  imports: [FormsModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  customerName = '';
  carModel = '';
  durationMonths = 12;

  protected readonly title = signal('Car Leasing App');
  protected readonly confirmation = signal('');

  submitLease(): void {
    this.confirmation.set(
      `Lease confirmed for ${this.customerName}: ${this.carModel} for ${this.durationMonths} months.`
    );
  }
}
