import controllers.ReimbursementController;
import controllers.UserController;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;


public class MainDriver {
    public static void main(String[] args) {

        Javalin app = Javalin.create(config ->{
            config.addStaticFiles("/login", Location.CLASSPATH);
        }).start(9000);

        UserController userController = new UserController();
        ReimbursementController reimbursementController = new ReimbursementController();

        app.post("/login", userController::login);

        app.get("/reimbursements", reimbursementController::displayAll);

        app.put("/reimbursements/{id}", reimbursementController::updateRmb);

        app.get("/user/{userID}/reimbursements", reimbursementController::displayAllRbmForUser);

        app.post("/user/{userID}/reimbursements", reimbursementController::createRmb);

        app.delete("/user/{userID}/reimbursements", reimbursementController::deleteRmb);
    }
}

