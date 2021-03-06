/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.todivefor.handicap;

import java.awt.event.ComponentAdapter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import net.proteanit.sql.DbUtils;
import org.todivefor.iconutils.IconUtils;
import org.todivefor.stringutils.StringUtils;

/**
 *
 * @author peterream
 */
public class MaintainCourses extends javax.swing.JPanel
{
    final static int MAXCOURSENAMELENGTH = 50;				// max course name length
    public static JPanel panelMaintainCourses;                          // MaintainCourse panel
    
/**
 *  Creates new form MaintainCourses
 */
    
    public MaintainCourses()
    {
        initComponents();
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        panelWest = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnUpdate.setVisible(false);    // Initially set invisible
        btnDelete = new javax.swing.JButton();
        textFieldAddCourseName = new javax.swing.JTextField();
        textFieldAddCourseName.setColumns(20);
        textFieldAddCourseCourseRating = new javax.swing.JTextField();
        textFieldAddCourseCourseSlope = new javax.swing.JTextField();
        textFieldAddCourseCourseSlope.setColumns(3);
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textFieldAddCourseCoursePar = new javax.swing.JTextField();
        textFieldAddCourseCoursePar.setColumns(2);
        panelSouth = new javax.swing.JPanel();
        btnAddCourseExit = new javax.swing.JButton();
        scrollPaneCenter = new javax.swing.JScrollPane();
        tableDisplayCourses = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        java.awt.GridBagLayout panelWestLayout = new java.awt.GridBagLayout();
        panelWestLayout.columnWidths = new int[] {0, 15, 0, 15, 0};
        panelWestLayout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        panelWest.setLayout(panelWestLayout);

        btnSave.setText("Add");
        btnSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(btnSave, gridBagConstraints);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUpdateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(btnUpdate, gridBagConstraints);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(btnDelete, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(textFieldAddCourseName, gridBagConstraints);

        textFieldAddCourseCourseRating.setColumns(3);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(textFieldAddCourseCourseRating, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(textFieldAddCourseCourseSlope, gridBagConstraints);

        jLabel4.setText("Course");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Rating");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(jLabel5, gridBagConstraints);

        jLabel6.setText("Slope");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(jLabel6, gridBagConstraints);

        jLabel1.setText("Par");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(textFieldAddCourseCoursePar, gridBagConstraints);

        add(panelWest, java.awt.BorderLayout.LINE_START);
        /*
        * 				This makes course name, rating, slope, and par select all
        */

        textFieldAddCourseName.addFocusListener(new java.awt.event.FocusAdapter()
            {
                public void focusGained(java.awt.event.FocusEvent evt)
                {
                    SwingUtilities.invokeLater(() ->
                        {
                            textFieldAddCourseName.selectAll();
                            textFieldAddCourseCourseRating.selectAll();
                            textFieldAddCourseCourseSlope.selectAll();
                            textFieldAddCourseCoursePar.selectAll();
                        });
                    }
                });

                btnAddCourseExit.setIcon(IconUtils.getNavigationIcon("Back", 24));
                btnAddCourseExit.setText("Back");
                btnAddCourseExit.addActionListener(new java.awt.event.ActionListener()
                {
                    public void actionPerformed(java.awt.event.ActionEvent evt)
                    {
                        btnAddCourseExitActionPerformed(evt);
                    }
                });
                panelSouth.add(btnAddCourseExit);

                add(panelSouth, java.awt.BorderLayout.PAGE_END);

                tableDisplayCourses.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][]
                    {
                        {},
                        {},
                        {},
                        {}
                    },
                    new String []
                    {

                    }
                ));
                tableDisplayCourses.addMouseListener(new java.awt.event.MouseAdapter()
                {
                    public void mouseClicked(java.awt.event.MouseEvent evt)
                    {
                        tableDisplayCoursesMouseClicked(evt);
                    }
                });
                scrollPaneCenter.setViewportView(tableDisplayCourses);

                add(scrollPaneCenter, java.awt.BorderLayout.CENTER);
                panelMaintainCourses = this;                              // This panel
                //  Not needed with RXCardLayout    <RXCardLayout>
                //      Focus textFieldCourseName for card layout
                panelMaintainCourses.addComponentListener(new ComponentAdapter()
                    {
                        @Override
                        public void componentShown(java.awt.event.ComponentEvent e)
                        {
                            textFieldAddCourseName.requestFocusInWindow();
                        }
                    });
                }// </editor-fold>//GEN-END:initComponents

    private void btnAddCourseExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddCourseExitActionPerformed
    {//GEN-HEADEREND:event_btnAddCourseExitActionPerformed
        btnSave.setVisible(true);                       // Set buttons
        btnUpdate.setVisible(false);                    //      to
        btnDelete.setVisible(false);                    //          initial state
        HandicapMain.resetTitle();                      // Set title in frame
        HandicapMain.lastCard = HandicapMain.MAINMENU;      // Force MAINMENU
        HandicapMain.cards.show(getParent(), 
                (String) HandicapMain.returnStack.pop());   // Return whence we came
    }//GEN-LAST:event_btnAddCourseExitActionPerformed

    private void tableDisplayCoursesMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tableDisplayCoursesMouseClicked
    {//GEN-HEADEREND:event_tableDisplayCoursesMouseClicked
/*
 * 			Mouse clicked on Course table				
 */
        btnSave.setVisible(false);                      // This is an update, make "Save" button hidden
        btnUpdate.setVisible(true);                     // This is an update, make update button visible
        btnDelete.setVisible(true);                     // This is an update/delete, make delete button visible
        try
        {
            int row = tableDisplayCourses.getSelectedRow(); // Table display row selected
            String NAME_ = tableDisplayCourses.getModel().getValueAt(row, 0).toString();    // Selected Course Name
            String query = "Select * from " + HandicapMain.courseTableName + " where Name = '" + NAME_ + "'";   // Query for course in DB
            PreparedStatement pst = SQLiteConnection.connection.prepareStatement(query);    //PST
            ResultSet rs = pst.executeQuery();                                              // Execute query
            if (rs.next())                                                        // Get course row
            {
                textFieldAddCourseName.setText(rs.getString("Name"));           // Get course name
                HandicapMain.saveCourseName = textFieldAddCourseName.getText(); // Save course name
                textFieldAddCourseCourseRating.setText(rs.getString("Rating")); // Get course rating
                textFieldAddCourseCourseSlope.setText(rs.getString("Slope"));   // Get course slope
                textFieldAddCourseCoursePar.setText(rs.getString("Par"));       // Get course par
            }
            else                                                        // Course not found in DB
            {
                  JOptionPane.showMessageDialog(null,
                          "Course not found in DB.  This should not happen",
                          "Bad Course", JOptionPane.ERROR_MESSAGE);
                  return;                                               // Get out
            }
            textFieldAddCourseName.requestFocusInWindow();		// set focus to course
            rs.close();                                                 // Close result set
            pst.close();                                                // Close query PST
        } catch (Exception e1)
        {
            e1.printStackTrace();
        }
    }//GEN-LAST:event_tableDisplayCoursesMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveActionPerformed
    {//GEN-HEADEREND:event_btnSaveActionPerformed
        if (!checkCourseNameLength())				// Course name < 51
        {
            return;						// No, get out of here
        }
//				Test for valid rating

        String ratingStr = textFieldAddCourseCourseRating.getText();    // Rating
        if (!(ratingStr.equals("")))                                    // Rating entered?
        {
            if (!StringUtils.isStringNumeric(ratingStr))                // Rating numeric?
            {
                JOptionPane.showMessageDialog(null, "Rating \" " + ratingStr
                        + "\"  is not a valid number, renenter.",
                        "Rating", JOptionPane.ERROR_MESSAGE);           // No, invalid rating
                return;                                                 // Get out
            }
        } 
        else                                                            // No reting entered
        {
            JOptionPane.showMessageDialog(null, "Rating \" " + ratingStr
                    + "\"  is not a valid number, renenter.",
                    "Rating", JOptionPane.ERROR_MESSAGE);               // Invalid rating
            return;                                                     // Get out
        }

//				Test for valid slope
        String slopeStr = textFieldAddCourseCourseSlope.getText();
        if (!(slopeStr.equals("")))
        {
            if (!StringUtils.isInteger(slopeStr))
            {
                JOptionPane.showMessageDialog(null, "Slope \" " + slopeStr
                        + "\"  is not a valid slope, renenter.",
                        "Slope", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Slope \" " + slopeStr
                    + "\"  is not a valid slope, renenter.",
                    "Slope", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
//				Test for valid Par
        String parStr = textFieldAddCourseCoursePar.getText();
        if (!(slopeStr.equals("")))
        {
            if (!StringUtils.isInteger(parStr))
            {
                JOptionPane.showMessageDialog(null, "Par \" " + parStr
                        + "\"  is not a valid par, renenter.",
                        "Par", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Par \" " + parStr
                    + "\"  is not a valid par, renenter.",
                    "Par", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try
        {
//              insert into courseTable Name, Rating, Slope 
            String query = "insert into " + HandicapMain.courseTableName + 
                    " (Name, Rating, Slope, Par) values(?, ?, ?, ?)";       // Add course to DB
            PreparedStatement pst = SQLiteConnection.connection.prepareStatement(query);    // PST
            pst.setString(1, textFieldAddCourseName.getText());             // Course name
            pst.setString(2, textFieldAddCourseCourseRating.getText());     // Course rating
            pst.setString(3, textFieldAddCourseCourseSlope.getText());      // Course slope
            pst.setString(4, textFieldAddCourseCoursePar.getText());      // Course par

            pst.execute();                                                  // Execute query
            JOptionPane.showMessageDialog(null, textFieldAddCourseName.getText() + " course added");    // Added

            pst.close();                                                    // Close PST
        } 
        catch (Exception e1)                                                // Exception is duplicate
        {
            JOptionPane.showMessageDialog(null, "You are trying to add a duplicate course");
            if (HandicapMain.debug)
            {
                e1.printStackTrace();
            }
        }
//				comboBoxCourse = Handicap.getComboBoxCourse();
//				MiscMethods.fillComboBox(connection, courseTableName);
        refreshCourseTable(SQLiteConnection.connection, HandicapMain.courseTableName);
//				HandicapMain.coursesDataChanged = true;		// Force reload courses
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUpdateActionPerformed
    {//GEN-HEADEREND:event_btnUpdateActionPerformed
        if (!checkCourseNameLength())				// Course name < 51?
        {
            return;                                             // No, get out
        }

        try
        {
            //  update courseTable set Name= Rating = Slope=  where Name =
            String query = "update " + HandicapMain.courseTableName + " set Name='"
                    + textFieldAddCourseName.getText() + "' ,"
                    + "Rating='" + textFieldAddCourseCourseRating.getText() + "',"
                    + "Slope='" + textFieldAddCourseCourseSlope.getText() + "',"
                    + "Par='" + textFieldAddCourseCoursePar.getText() + "' "
                    + "where Name='" + HandicapMain.saveCourseName + "'";

            PreparedStatement pst = SQLiteConnection.connection.prepareStatement(query);    // PST query

            pst.execute();                                                  // Execute query
            if (HandicapMain.debug)                                         // Debug?
            {
                JOptionPane.showMessageDialog(null, textFieldAddCourseName.getText()
                        + " course updated");                               // Yes, updated message
            }

            pst.close();                                                    // Close PST
        } 
        catch (Exception e1)                                                // Exception unknown
        {
            e1.printStackTrace();
            return;                                                         // Get out <new code>
        }
        refreshCourseTable(SQLiteConnection.connection, HandicapMain.courseTableName);  // Refresg course table
        btnSave.setVisible(true);                       // Set buttons
        btnUpdate.setVisible(false);                    //      to
        btnDelete.setVisible(false);                    //          initial state
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        int action = JOptionPane.showConfirmDialog(null, "Do you really want to delete "
                + textFieldAddCourseName.getText() + "?", "Delete", JOptionPane.YES_NO_OPTION);
        if (action == 0)                                        // Delete?
        {
            try
            {
//          delete from courseTable where Name=
                String query = "delete from " + HandicapMain.courseTableName
                        + " where Name='" + textFieldAddCourseName.getText() + "' ";            // Query
                PreparedStatement pst = SQLiteConnection.connection.prepareStatement(query);    // PST
                pst.execute();                                                                  // Execute query
                JOptionPane.showMessageDialog(null, textFieldAddCourseName.getText() + " course deleted");
                pst.close();                                                                    // Close PST
            } 
            catch (Exception e1)
            {
                e1.printStackTrace();
                return;                                                                         // Get out <new code>
            }
            refreshCourseTable(SQLiteConnection.connection, HandicapMain.courseTableName);      // Refresh course table
        }
        btnSave.setVisible(true);                       // Set buttons
        btnUpdate.setVisible(false);                    //      to
        btnDelete.setVisible(false);                    //          initial state
    }//GEN-LAST:event_btnDeleteActionPerformed

/*
 *      Beginning of common methods within MaintainCourses class
 */
    
/**
 * This method creates the course table from courseTableName
 */
    public static void createCourseTable(String userName)
    {
/*
 * 	 Create new COURSE table
 */

        HandicapMain.courseTableName = "COURSE_TBL";                    // courseTableName = COURSE_TBL

        try
        {
            String query = "CREATE TABLE " + HandicapMain.courseTableName
                    + "(Name TEXT(45) NULL, "
                    + "Rating DOUBLE(3) NULL, "
                    + "Slope INTEGER(3) NULL, "
                    + "Par INTEGER(2) NULL, "
                    + "PRIMARY KEY(Name))";

            PreparedStatement pst = SQLiteConnection.connection.prepareStatement(query);
//					pst.setString(1, "NewTable");
            pst.execute();
            pst.close();
        } 
        catch (SQLException e1)                                 // Exception - duplicate
        {
            JOptionPane.showMessageDialog(null, "Duplicate COURSE table, using previous: " 
                    + HandicapMain.courseTableName,
                    "COURSE table change", JOptionPane.INFORMATION_MESSAGE);
            e1.printStackTrace();
        }
    }
    
	/**
	 * This method test length of Course name (< 51)
	 * @return
	 */
	private boolean checkCourseNameLength() 
	{
		if (textFieldAddCourseName.getText().length() > MAXCOURSENAMELENGTH)    // Course name > 50?
		{
			JOptionPane.showMessageDialog(null, "Course name must be less than" 
					+ MAXCOURSENAMELENGTH + " characters.",
					"Course name", JOptionPane.WARNING_MESSAGE);
			return false;                   // Yes, return error
		}
		return true;                            // No, good name
	}
 
/**
 * This method refreshes the course table
 * 
 * @param Connection connection
 */

    public static void refreshCourseTable(Connection connection, String courseTableName)
    {
        try
        {
//                  select * from courseTable Order by Name
            String query = "select * from " + courseTableName + " Order by Name";
            PreparedStatement pst = connection.prepareStatement(query);     // PST query
            ResultSet rs = pst.executeQuery();

            //  Load table using rs2xml.jar  video 12
            //  https://www.youtube.com/watch?v=6cNYUc2PIag&list=PLS1QulWo1RIbYMA5Ijb72QHaHvCrPKfS2&index=12
            //  https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwip2K3KnuHKAhULlh4KHYa3AOUQFggcMAA&url=http%3A%2F%2Fsourceforge.net%2Fprojects%2Ffinalangelsanddemons%2F&usg=AFQjCNG_PLve63VxZe5Mg0niMGgRtZolPQ&sig2=V4xTJprXP6xgkFmTMf06LA&bvm=bv.113370389,d.dmo
            MaintainCourses.tableDisplayCourses.setModel(DbUtils.resultSetToTableModel(rs));

            rs.close();                             // Close result set
            pst.close();                            // Close PST

        } 
        catch (Exception e1)
        {
            e1.printStackTrace();
        }
        DisplayScores.renderColumns(MaintainCourses.tableDisplayCourses);	// Set column sizes for table tableDisplayCourses

        fillComboBox(connection, courseTableName); 		// Load course comboBox
    }
    
/**
 * This method fills the Add Scores course combobox
 * Adds course combobox listener when combobox filled
 * @param connection
 */

    public static void fillComboBox(Connection connection, String courseTableName)
    {     
        AddScores.comboBoxCourse.removeActionListener(AddScores.
                courseListener);                                            // Remove listener for course combobox
        AddScores.comboBoxCourse.removeAllItems();                          // clear combobox
        try
        {
//              select * from courseTable 
            String query = "select * from " + courseTableName + "";
            PreparedStatement pst = connection.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next())
            {
                AddScores.comboBoxCourse.addItem(rs.getString("Name")); //  Add course to combo box
            }
            rs.close();                                                 // Close result set
        } 
        catch (Exception e1)
        {
            e1.printStackTrace();
        }
        AddScores.comboBoxCourse.addActionListener(AddScores.
                courseListener);                                        // Add listener for course combobox
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCourseExit;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JPanel panelWest;
    private javax.swing.JScrollPane scrollPaneCenter;
    public static javax.swing.JTable tableDisplayCourses;
    public static javax.swing.JTextField textFieldAddCourseCoursePar;
    public static javax.swing.JTextField textFieldAddCourseCourseRating;
    public static javax.swing.JTextField textFieldAddCourseCourseSlope;
    public static javax.swing.JTextField textFieldAddCourseName;
    // End of variables declaration//GEN-END:variables
}
