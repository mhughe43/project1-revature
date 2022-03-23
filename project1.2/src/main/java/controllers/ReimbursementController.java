package controllers;

import io.javalin.http.Context;
import models.JsonResponse;
import models.Reimbursement;
import services.ReimbursementService;

import java.util.List;

public class ReimbursementController {
    private ReimbursementService reimbursementService;
    private Reimbursement reimbursement;

    public ReimbursementController(){
        this.reimbursementService = new ReimbursementService();
    }

    public ReimbursementController(ReimbursementService reimbursementService){
        this.reimbursementService = reimbursementService;
    }

    public void displayAll(Context context){
        Reimbursement reimbursement = context.bodyAsClass(Reimbursement.class);

        List<Reimbursement> reimbursements = reimbursementService.displayAll();
        context.json(new JsonResponse(true, "Displaying all reimbursements for all employees", reimbursements));
    }

    public void displayAllRbmForUser(Context context){
        Integer userID = Integer.parseInt(context.pathParam("userId"));

        List<Reimbursement> reimbursements = reimbursementService.getAllRmbByUserId(userID);
        context.json(new JsonResponse(true, "Displaying all reimbursement for employee " + userID, reimbursementService.getAllRmbByUserId(userID)));

    }

    public void createRmb(Context context){
        Reimbursement reimbursement = context.bodyAsClass(Reimbursement.class);

        reimbursementService.createRmb(reimbursement);

        context.json(new JsonResponse(true, "New reimbursement created for employee " + reimbursement.getId(), null));
    }

    public void deleteRmb(Context context){
        Integer rbmId = Integer.parseInt(context.pathParam("rbmId"));
        Reimbursement reimbursement = context.bodyAsClass(Reimbursement.class);

        reimbursementService.deleteRmb(rbmId);

        context.json(new JsonResponse(true, "Reimbursement number " +reimbursement.getId()+ " has been deleted", null));
    }


    public void updateRmb(Context context){
        Integer rmbId = Integer.parseInt(context.pathParam("id"));
        Reimbursement reimbursement = context.bodyAsClass(Reimbursement.class);

        reimbursementService.updateRmb(rmbId);

        context.json(new JsonResponse(true, "Reimbursement number " + reimbursement.getId()+ " has been updated",null));
    }

}

