import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';

@Component({
  selector: 'app-movie',
  imports: [MatCardModule],
  templateUrl: './movie.component.html',
  styleUrl: './movie.component.css'
})
export class MovieComponent {
 movies = [
    {
      title: 'RakthaCharitra',
      genre: 'Action',
      rating: 4.5,
      description: 'Movie is based on the violence ',
      image: 'https://assets-in.bmscdn.com/iedb/movies/images/mobile/thumbnail/xlarge/rakhta-charitra--telugu--et00004796-24-03-2017-19-08-33.jpg'
    },
    {
      title:'Devara',
      genre: 'Action/Drama',
      rating:4.0,
      description:'Movie based on the fear',
      image:'https://stat4.bollywoodhungama.in/wp-content/uploads/2024/09/Devara-1.jpg'

    },
    {
      title: 'TholiPrema',
      genre: 'Love',
      rating: 4.5,
      description: 'Aadi (Varun Tej) is an instinctive youngster who falls in love with Varsha (Raashi Khanna) when he spots her for the first time in a train journey.',
      image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOBGUDhl1TkmU76LVLa3SjpgWMJ6zleUttCA&s'
    },
    {
      title: 'Goodachaari',
      genre: 'Action/Suspence',
      rating: 4.3,
      description: 'A young man who, inspired by his late father, joins the Indian secret service agency Trinetra and trains to become a spy.',
      image: 'https://cdn.123telugu.com/content/wp-content/uploads/2018/08/goodachari-m1.jpg'
    },
    {
      title: 'Saahasam',
      genre: 'Action/Suspence,Adventure',
      rating: 4.0,
      description: 'the journey of an ordinary individual whose life takes an unexpected turn after a chance encounter sets them on a path filled with unforeseen challenges.',
      image: 'https://m.media-amazon.com/images/S/pv-target-images/bdc87349da93e1584d666204c5f3f4b95eba6c74158058a41b88ffa4972428ea._SX1080_FMjpg_.jpg'
    }
   
  ];

}