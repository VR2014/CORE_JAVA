package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.models.Student;
import com.utilitys.ConnectionUtil;

public class StudentManagementDao {

	public static void addingStudent(Student std) {
		String sql = "INSERT INTO STUDENTS VALUES (?,?,?)";
		try {
			Connection conn = ConnectionUtil.getDataConnection();
			if (conn != null) {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, std.getId());
				ps.setString(2, std.getName());
				ps.setInt(3, std.getAge());
				int rs = ps.executeUpdate();
				if (rs > 0) {
					System.out.println("Student is Added ");
				}
			}
		} catch (Exception e) {
			 System.out.println("Error while adding student: " + e.getMessage());
		}
	}

	public static List<Student> getAllStudents() {
		List<Student> st = new ArrayList<>();
		String sql = "SELECT * FROM STUDENTS";
		try {
			Connection conn = ConnectionUtil.getDataConnection();
			if (conn != null) {
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery(sql);
				while (rs.next()) {
					Student sts = new Student();
					sts.setId(rs.getInt("id"));
					sts.setName(rs.getString("name"));
					sts.setAge(rs.getInt("age"));
					st.add(sts);
				}

			}
		} catch (Exception e) {
			System.out.println("Error while getAllStudents  :"+e.getMessage());
		}
		return st;
	}

	public static void deleteStudent(int id) {
		String sql = "DELETE FROM STUDENTS WHERE ID = ?";
		try {
			Connection conn = ConnectionUtil.getDataConnection();
			if (conn != null) {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, id);
				int rs = ps.executeUpdate();
				if (rs > 0) {
					System.out.println("Student is deleted  ");
				}
			}
		} catch (Exception e) {
			System.out.println("Error while addingStudent");
		}
	}

}