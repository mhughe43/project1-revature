package repositories;

import models.Reimbursement;

import java.util.List;

public interface ReimbursementDAO {

    List<Reimbursement> showAllRbm();
    List<Reimbursement> showAllRbmUser (Integer userId); //show all reimbursement requests for one user
    void createRmb (Reimbursement reimbursement); //create a reimbursement request
    Reimbursement updateRmb (Integer id); //update a reimbursement request
    void deleteRmb (Integer id); //delete a reimbursement request


}

