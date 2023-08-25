package zrouga.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zrouga.example.demo.Model.Projects;
import zrouga.example.demo.Model.Skill;
import zrouga.example.demo.Model.Sociallinks;
@Repository
public interface  ProjectsRepo  extends  JpaRepository<Projects, Integer>{

}
