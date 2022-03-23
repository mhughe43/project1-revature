package repositories;


import models.Reimbursement;
import utility.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReimbursementDAOImp implements ReimbursementDAO{

    @Override
    public List<Reimbursement> showAllRbm() {
        List<Reimbursement> reimbursementRequests = new ArrayList<>();

        try (Connection conn = ConnectionUtil.getConnection()){

            String sql = "select * from reimbursement;";

            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                reimbursementRequests.add(new Reimbursement(
                        rs.getInt(1),
                        rs.getDouble(2),
                        rs.getDate(3),
                        rs.getDate(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9)));


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return reimbursementRequests;
    }



    @Override //Showing all Reimbursement Requests for one specific user
    public List<Reimbursement> showAllRbmUser(Integer userId) {
        List<Reimbursement> reimbursements= new ArrayList<>();
        try(Connection conn = ConnectionUtil.getConnection()){

            String sql = "SELECT * FROM reimbursement WHERE rmb_author_fk = ?;";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                reimbursements.add(new Reimbursement(rs.getInt(1),
                        rs.getDouble(2),
                        rs.getDate(3),
                        rs.getDate(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9)));
            }
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
        return reimbursements;
    }

    @Override//creating a reimbursement
    public void createRmb(Reimbursement reimbursement) {

        try(Connection conn = ConnectionUtil.getConnection()){
            String sql = "INSERT INTO reimbursement (rmb_amount, rmb_submitted, rmb_description, rmb_author_fk, rmb_type_id_fk, rmb_status_id_fk)\n" +
                    "VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, reimbursement.getAmount());
            ps.setDate(2,(Date) reimbursement.getDateSubmitted());
            ps.setString(3, reimbursement.getDescription());
            ps.setInt(4, reimbursement.getAuthor());
            ps.setInt(5, reimbursement.getStatusId());
            ps.setInt(6, reimbursement.getTypeId());

            ps.executeUpdate();

        } catch(SQLException sqle){
            sqle.printStackTrace();
        }


    }

    @Override
    public Reimbursement updateRmb(Integer id) {
        try(Connection conn = ConnectionUtil.getConnection()){
            Reimbursement reimbursement = new Reimbursement();

            String sql = "UPDATE reimbursement SET rmb_resolved = current_timestamp, rmb_resolver_fk = ?, rmb_status_id_fk = ? WHERE rmb_id = ?;";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, reimbursement.getResolver());
            ps.setInt(2, reimbursement.getStatusId());
            ps.setInt(3, reimbursement.getId());

            ps.executeUpdate();

        }catch (SQLException sqle){
            sqle.printStackTrace();

        }
        return null;
    }

//    @Override //updating reimbursement by the finance manager
//    public Reimbursement updateRmb(Reimbursement reimbursement) {
//        try(Connection conn = ConnectionUtil.getConnection()){
//
//            String sql = "UPDATE reimbursement SET rmb_resolved = current_timestamp, rmb_resolver_fk = ?, rmb_status_id_fk = ? WHERE rmb_id = ?;";
//
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, reimbursement.getResolver());
//            ps.setInt(2, reimbursement.getStatusId());
//            ps.setInt(3, reimbursement.getId());
//
//            ps.executeUpdate();
//
//        }catch (SQLException sqle){
//            sqle.printStackTrace();
//
//        }
//        return null;
//    }

    @Override//Deleting a reimbursement
    public void deleteRmb(Integer id) {
        try (Connection conn = ConnectionUtil.getConnection()){

            String sql = "DELETE FROM reimbursement WHERE rmb_id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

    }
}

