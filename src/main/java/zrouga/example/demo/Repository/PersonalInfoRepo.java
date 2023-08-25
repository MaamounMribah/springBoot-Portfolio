package zrouga.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zrouga.example.demo.Model.PersonalInfo;
import zrouga.example.demo.Model.Skill;
@Repository
public interface  PersonalInfoRepo  extends  JpaRepository<PersonalInfo, Integer>{

}
