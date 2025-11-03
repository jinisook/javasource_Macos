package student2.service;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import student2.dto.DeptDTO;
import student2.repository.DeptDAO;

public class DeptService {

    public boolean addDept(DeptDTO dto) {
        Connection con = null;
        boolean isAdd = false;
        try {
            con = getConnection();
            DeptDAO dao = new DeptDAO(con);
            int result = dao.insert(dto);

            if (result > 0) {
                commit(con);
                isAdd = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        }
        close(con);
        return isAdd;
    }

    public boolean updateDept(DeptDTO dto) {
        Connection con = null;
        boolean isUpdate = false;
        try {
            con = getConnection();
            DeptDAO dao = new DeptDAO(con);
            int result = dao.update(dto);

            if (result > 0) {
                commit(con);
                isUpdate = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        }
        close(con);
        return isUpdate;
    }

    public boolean removeDept(String deptId) {
        Connection con = null;
        boolean isDelete = false;
        try {
            con = getConnection();
            DeptDAO dao = new DeptDAO(con);
            int result = dao.delete(deptId);

            if (result > 0) {
                commit(con);
                isDelete = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        }
        close(con);
        return isDelete;
    }

    public DeptDTO getDept(String deptName) {
        Connection con = null;
        try {
            con = getConnection();
            DeptDAO dao = new DeptDAO(con);
            DeptDTO dto = dao.getRow(deptName);
            return dto;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        close(con);
        return null;

    }

    public List<DeptDTO> getDepts() {
        Connection con = null;
        try {
            con = getConnection();
            DeptDAO dao = new DeptDAO(con);
            List<DeptDTO> list = dao.getRows();
            return list;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        close(con);
        return null;
    }

}
