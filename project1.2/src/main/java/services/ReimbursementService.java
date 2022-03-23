package services;

import models.Reimbursement;
import repositories.ReimbursementDAO;
import repositories.ReimbursementDAOImp;

import java.util.List;

public class ReimbursementService {

    private ReimbursementDAO reimbursementDAO;

    public ReimbursementService(){
        this.reimbursementDAO = new ReimbursementDAOImp();
    }

    public ReimbursementService(ReimbursementDAO reimbursementDAO){
        this.reimbursementDAO = reimbursementDAO;
    }

    public List<Reimbursement> displayAll(){
        return this.reimbursementDAO.showAllRbm();
    }

    public List<Reimbursement> getAllRmbByUserId (Integer userId){
        return this.reimbursementDAO.showAllRbmUser(userId);
    }

    public void createRmb(Reimbursement reimbursement){
        this.reimbursementDAO.createRmb(reimbursement);

    }

    public void deleteRmb(Integer id){
        this.reimbursementDAO.deleteRmb(id);
    }

    public void updateRmb(Integer id){
        this.reimbursementDAO.updateRmb(id);
    }

}

