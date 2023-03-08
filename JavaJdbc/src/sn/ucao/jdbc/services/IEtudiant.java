package sn.ucao.jdbc.services;

import sn.ucao.jdbc.entities.Etudiant;

public interface IEtudiant {

    boolean saveStudent(Etudiant etudiant) throws Exception;

    boolean UpdateStudentbyName(String nom, int i);

    boolean updateStudentbyName(Etudiant etudiant);
}
