package zrouga.example.demo.Model;
import java.time.LocalDate;
import java.util.ArrayList;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Experiences")
@Entity
public class Experiences {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String title;
	    private String company;
	    private LocalDate startDate;
	    private LocalDate endDate;
	    private String description;
	    private  ArrayList<String> photos;
	    private  ArrayList<String> videos;
	    private  ArrayList<String> file;
}
