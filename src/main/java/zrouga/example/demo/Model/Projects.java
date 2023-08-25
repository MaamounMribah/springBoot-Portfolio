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
@Table(name = "Projects")
@Entity
public class Projects {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String description;
	    private  ArrayList<String> photos;
	    private  ArrayList<String> videos;
	    private  ArrayList<String> file;
	    private LocalDate startDate;
	    private LocalDate endDate;
}
