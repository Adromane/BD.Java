package sn.ucao.jdbc.services;

import sn.ucao.jdbc.entities.Etudiant;
import sn.ucao.jdbc.utils.DBHelper;

public class EtudiantImpl implements IEtudiant{

    DBHelper db = DBHelper.getInstance();

    @Override
    public boolean saveStudent(Etudiant etudiant) throws Exception {
        try{
            String requete = "INSERT INTO etudiants VALUES(null,?,?,?,?,?)";
            db.myPrepareStatement(requete);

            db.addParametres(1,etudiant.getNom());
            db.addParametres(2,etudiant.getPrenom());
            db.addParametres(3,etudiant.getAge());
            db.addParametres(4,etudiant.getTelephone());
            db.addParametres(2,etudiant.getAdresse());

            db.myExecutePrepareUpdate();
            return true;
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public boolean UpdateStudentbyName(String nom, int i) {
        return false;
    }
}
