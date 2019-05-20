/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.todivefor.handicap;

import java.awt.event.ComponentAdapter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.iconutils.IconUtils;
import org.todivefor.string.utils.StringUtils;

/**
 *
 * @author peterream
 */
public class AddScores extends javax.swing.JPanel
{
    public static boolean fillingCourseCombobox = true;		// Filling initial combobox
    public static int duplicate = 0;                            // Auto-increment duplicate date
    public static JPanel panelAddScores;                        // AddScores main panel
    
    /**
     * Creates new form AddScores
     */
    public AddScores()
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textFieldScore = new javax.swing.JTextField();
        textFieldScore.setColumns(3);
        textFieldCourseRating = new javax.swing.JTextField();
        textFieldCourseRating.setColumns(4);
        textFieldCourseSlope = new javax.swing.JTextField();
        textFieldCourseSlope.setColumns(3);
        comboBoxCourse = new javax.swing.JComboBox<>();
        dateChooserAddScoresDate = new com.toedter.calendar.JDateChooser();
        chckbxAddScoresNineHoleScore = new javax.swing.JCheckBox();
        chckbxAddScoresTournamentScore = new javax.swing.JCheckBox();
        btnAddScoresAdd = new javax.swing.JButton();
        btnAddScoreDelete = new javax.swing.JButton();
        btnAddScoreDelete.setVisible(false);        // Initially turn "Delete" button off
        panelSouth = new javax.swing.JPanel();
        btnAddScoresExit = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        textFieldScore.requestFocusInWindow();
        java.awt.GridBagLayout panelWestLayout = new java.awt.GridBagLayout();
        panelWestLayout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0};
        panelWestLayout.rowHeights = new int[] {0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0};
        panelWest.setLayout(panelWestLayout);

        jLabel1.setText("Score");
        jLabel1.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelWest.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Date");
        jLabel2.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelWest.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Course");
        jLabel3.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelWest.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Course Rating");
        jLabel4.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelWest.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Course Slope");
        jLabel5.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelWest.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(textFieldScore, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(textFieldCourseRating, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(textFieldCourseSlope, gridBagConstraints);

        comboBoxCourse.setEditable(true);
        comboBoxCourse.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                comboBoxCourseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(comboBoxCourse, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(dateChooserAddScoresDate, gridBagConstraints);
        dateChooserAddScoresDate.setDateFormatString("MM/dd/yy");

        chckbxAddScoresNineHoleScore.setText("Nine Hole Score");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        panelWest.add(chckbxAddScoresNineHoleScore, gridBagConstraints);

        chckbxAddScoresTournamentScore.setText("Tournament Score");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        panelWest.add(chckbxAddScoresTournamentScore, gridBagConstraints);

        btnAddScoresAdd.setText("Add");
        btnAddScoresAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddScoresAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(btnAddScoresAdd, gridBagConstraints);

        btnAddScoreDelete.setText("Delete");
        btnAddScoreDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddScoreDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panelWest.add(btnAddScoreDelete, gridBagConstraints);

        add(panelWest, java.awt.BorderLayout.CENTER);

        btnAddScoresExit.setIcon(IconUtils.getNavigationIcon("Back", 24));
        btnAddScoresExit.setText("Back");
        btnAddScoresExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddScoresExitActionPerformed(evt);
            }
        });
        panelSouth.add(btnAddScoresExit);

        add(panelSouth, java.awt.BorderLayout.PAGE_END);
        panelAddScores = this;                              // AddScores main panel
        //  Not needed with RXCardLayout    <RXCardLayout>
        //      Focus textFieldScore for card layout
        panelAddScores.addComponentListener(new ComponentAdapter()
        {
            @Override
            public void componentShown(java.awt.event.ComponentEvent e)
            {
                textFieldScore.requestFocusInWindow();
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddScoresExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddScoresExitActionPerformed
    {//GEN-HEADEREND:event_btnAddScoresExitActionPerformed
        btnAddScoreDelete.setVisible(false);			// Make delete button not visible
        btnAddScoresAdd.setText("Add");				// change button back to Add in Add Score
//        HandicapMain.cards.show(getParent(), HandicapMain.DISPLAYSCORES);   // DISPLAYSCORES or MAINMENU
        HandicapMain.resetTitle();                              // Set title in frame
        HandicapMain.cards.show(getParent(), 
                (String) HandicapMain.returnStack.pop());       // DISPLAYSCORES or MAINMENU
    }//GEN-LAST:event_btnAddScoresExitActionPerformed

    @SuppressWarnings("unchecked")
    private void btnAddScoreDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddScoreDeleteActionPerformed
    {//GEN-HEADEREND:event_btnAddScoreDeleteActionPerformed
        if (!HandicapMain.returnStack.peek().equals(HandicapMain.DISPLAYSCORES))    // Already returning to DISPLAYSCORES             
            HandicapMain.returnStack.push(HandicapMain.DISPLAYSCORES);              // No, push DISPLAYSCORES to returnStack 
        deleteRow();
        DisplayScores.scoreDataChanged = true;                          // Force HI recalc
        DisplayScores.tournament = false;                               // Set displaying T scores off
        DisplayScores.refreshScoreTable(HandicapMain.scoreTableName);	// Delete, must redisplay
        chckbxAddScoresTournamentScore.setSelected(false);				// Set tournament off
        if (HandicapMain.inicatorTournOrNineOnDB.equals(HandicapMain.NINEINDICATOR))	// Was 9 set in record?
        {
            HandicapMain.handicapPrefs.remove(HandicapMain.HANDICAPNINEHOLE); 	// Yes, turn off 9 hole hanging
            HandicapMain.inicatorTournOrNineOnDB = null;			// Set off to be safe
        }
        chckbxAddScoresNineHoleScore.setSelected(false);			// Set nine hole off
        btnAddScoresAdd.setText("Add");					// change button back to Add in Add Score
        btnAddScoreDelete.setVisible(false);				// Make delete button not visible
        HandicapMain.cards.show(getParent(), 
                (String) HandicapMain.returnStack.pop());               // Selec DisplayScores card
    }//GEN-LAST:event_btnAddScoreDeleteActionPerformed
/**
 *  This method deletes row from SCORE_TBL pointed at by DisplayScores.saveDate
 */
    public static void deleteRow()
    {
            // delete from SCORE_TBL where DateField = yyyy-MM-dd
            String query = "delete from " + HandicapMain.
                    scoreTableName + " where DateField = ?";
            try (PreparedStatement pst = SQLiteConnection.
                    connection.prepareStatement(query))         // Try PST with resources
            {
                pst.setString(1, DisplayScores.saveDate);       // Date in query
                pst.execute(); // Execute query
                                                                // Try closes Prepared Statement
            }
            catch (SQLException e1)
            {
                e1.printStackTrace();
            }
    }

    @SuppressWarnings("empty-statement")
    private void btnAddScoresAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddScoresAddActionPerformed
    {//GEN-HEADEREND:event_btnAddScoresAddActionPerformed
        if (!HandicapMain.returnStack.peek().equals(HandicapMain.DISPLAYSCORES))    // Already returning to DISPLAYSCORES             
            HandicapMain.returnStack.push(HandicapMain.DISPLAYSCORES);              // No, push DISPLAYSCORES to returnStack
        boolean success = false;                            // Determine success from addOrUpdate method                                                      
        String nineHoleHang = HandicapMain.handicapPrefs.get(HandicapMain.HANDICAPNINEHOLE,
                HandicapMain.NONH);                         // 9 hole hanging in preferences

/*
 * 				*******	
 * 				This code does not allow an update to the 9 hole indicator
 * 				that will cause 2 nine hole scores to be combined (ie change
 * 				indicator to on with a 9 hole score hanging).
 * 
 * 				This code can be reviewed to allow a 9 hole combination to occur when
 * 				maintenance is applied to change the indicator (ie turn indicator on
 * 				with a 9 hole score hanging.  You would have to combine scores and
 * 				then delete the remaining score.
 */
        if ((btnAddScoresAdd.getText().equals("Update"))
                && ((chckbxAddScoresNineHoleScore.isSelected())
                && (!HandicapMain.inicatorTournOrNineOnDB.equals(HandicapMain.NINEINDICATOR))
                && (!nineHoleHang.equals(HandicapMain.NONH))))
        {
            JOptionPane.showMessageDialog(null, "You are trying to make a change to nine hole score indicator, "
                    + "that will cause a combination, delete and then add to accomplish");
        } 
        else
        {

/*
 * 				Assume this is a straight "Add"
 */
            // insert into SCORE_TBL (DateField, Course, T, Score, Rating, Slope, Differential)
            String query = "insert into " + HandicapMain.scoreTableName + " (DateField, Course, T, Score,"
                    + " Rating, Slope, Differential)"
                    + " values(?, ?, ?, ?, ?, ?, ?)";

/*
 * 				If an update or 9 hole selected and a 9 hole score hanging,
 * 					do an update
 */
            if ((btnAddScoresAdd.getText().equals("Update"))
                    || (chckbxAddScoresNineHoleScore.isSelected()) && (!nineHoleHang.equals(HandicapMain.NONH)))
            {
                // update SCORE_TBL SET DateField, Course, T, Score, Rating, Slope, Differential WHERE DateField
                query = "update " + HandicapMain.scoreTableName + " SET DateField = ?, Course = ?,"
                        + " T = ?, Score = ?, Rating = ?,"
                        + " Slope = ?, Differential = ? WHERE DateField = ?";
            }

            try
            {
/*
 *  Call addOrUpdateDBRow 
 *      Success (true)
 *          Row was written (duplicate < 99)
 *          Invalid score (duplicate = 99)
 *      Success (false)
 *              Same date - auto-increment
                
 *          true and duplicate = 0      -> normal
 *          true and duplicate = 90     -> real duplicate
 *          true and duplicate < 90     -> score added for same day
 *          true and duplicate = 98     -> SQLite error
 *          true and duplicate = 99     -> Invalid score
 *          false                       -> same day score auto-increment
 */
                duplicate = 0;                                      // Initialize auto-increment
                while(!addOrUpdateDBRow(query));                    // Add or update row until success                
            } 
            catch (SQLException e1)
            {
                e1.printStackTrace();
            }

            if (duplicate < 90)                                     // Duplicate > 90 error
            {
                if (HandicapMain.debug)                             // <debug>
                {
                    JOptionPane.showMessageDialog(null, "Data updated");
                }
            } 
            else                                                // Returned a >= 90 error from addOrUpdateDBRow
            {
                textFieldScore.requestFocusInWindow();		// set focus to score
                return;						// Invalid score entered or SQLite error
            }
        }
        //  All is good - Add or Update
        DisplayScores.scoreDataChanged = true;			// Force score redisplay
        btnAddScoreDelete.setVisible(false);			// Make delete button not visible
        chckbxAddScoresTournamentScore.setSelected(false);	// Set tournament off
        chckbxAddScoresNineHoleScore.setSelected(false);	// Set nine hole off
        DisplayScores.tournament = false;                               // Not tournament display
        DisplayScores.refreshScoreTable(HandicapMain.scoreTableName);	// Change, must redisplay
        if ((btnAddScoresAdd.getText().equals("Update")))               // How did we get here?
        {
            btnAddScoresAdd.setText("Add");				// change button back to Add in Add Score
        }
        HandicapMain.cards.show(getParent(), HandicapMain.ADDSCORES);   // Return ADDSCORES
    }//GEN-LAST:event_btnAddScoresAddActionPerformed

    private void comboBoxCourseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_comboBoxCourseActionPerformed
    {//GEN-HEADEREND:event_comboBoxCourseActionPerformed
/*
 * 
 * 
 * 	If this event was activated due to filling combobox, do nothing
 * 	Only do anything if combobox has been clicked
 * 
 */
        if (!fillingCourseCombobox)
            getCourse((String) comboBoxCourse.getSelectedItem());	// Lookup course, then rating and slope
    }//GEN-LAST:event_comboBoxCourseActionPerformed

    /*
    Beginning of common methods within AddScores class
    */
    
    /**
     * This method creates the score table from scoreTableName
     * @param userName
     */
    
    public static void createScoreTable(String userName)
    {
/*
 * 	 Create new SCORE table
 */

        HandicapMain.scoreTableName = userName + "_SCORE_TBL";

//        try
//        {
        String query = "CREATE TABLE " + HandicapMain.scoreTableName
                + "(DateField DATETIME NOT NULL, "
                + "Course TEXT(45) NULL, "
                + "T CHAR(1) NULL, "
                + "Score INTEGER(3) NULL, "
                + "U CHAR(1) NULL, "
                + "Rating DOUBLE(3) NULL, "
                + "Slope INTEGER(3) NULL, "
                + "Differential DOUBLE(3) NULL, "
                + //				"DateSort DATETIME NOT NULL, " +
                "PRIMARY KEY(DateField))";
        try (PreparedStatement pst = SQLiteConnection.connection.
                prepareStatement(query))                            // PST
        {
            pst.execute();                                          // Execute query
                                                                    // Close Ptrepared Statement
        }
        catch (SQLException e1)         // Assuming creating duplicate table   
        {
            JOptionPane.showMessageDialog(null, "Duplicate SCORE table,"
                    + " using previous: " + HandicapMain.scoreTableName,
                    "SCORE table change", JOptionPane.ERROR_MESSAGE);
            e1.printStackTrace();                                   // Print trace in case
            return;                                                 // Just get out
        }                
/*
 * Set score table in in preferences
 * Setup a new variable to be used in all score DB queries
 */
            if (!userName.contains("YrEnd"))                        // Archive ScoreTable?
            {
                HandicapMain.handicapPrefs.put(HandicapMain.
                        HANDICAPSCORETABLENAME,
                        HandicapMain.scoreTableName);               //  No, save the new in preference
                try                              
                {
                    HandicapMain.handicapPrefs.flush();             // Make all preferences changes permanent
                }
                catch (BackingStoreException ex)
                {
                    Logger.getLogger(HandicapMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            else                // This is an archive file, strip off YrEndYYYY_ to get original
            {
                int yrEndNameLoc = userName.indexOf("YrEnd");       // Location of "YrEnd"
                String yrEndName = HandicapMain.scoreTableName.
                        substring(yrEndNameLoc,yrEndNameLoc + 10);  // YrEnd-YYYY_
                HandicapMain.scoreTableName = 
                        HandicapMain.scoreTableName.
                        replace(yrEndName, "");                     // Strip off "YrEnd-YYYY_"
            }

//        } 
//        catch (SQLException e1)         // Assuming creating duplicate table
//        {
//            JOptionPane.showMessageDialog(null, "Duplicate SCORE table,"
//                    + " using previous: " + HandicapMain.scoreTableName,
//                    "SCORE table change", JOptionPane.ERROR_MESSAGE);
////					e1.printStackTrace();
//        }
    }
    
    /**
     * getCourse method fills the rating and slope from the course table on the
     * add scores screen
     *
     * @param course
     */
    public static void getCourse(String course)
    {
        // Select * from COURSE_TBL where Name = Course
        String query = "Select * from " + HandicapMain.courseTableName 
                + " where Name = '" + course + "'";                     // SQL query for course
//            pst.setString(1, course);                                   // Set course in query
        try (PreparedStatement pst = SQLiteConnection.connection.
                prepareStatement(query);                                // PST
                ResultSet rs = pst.executeQuery())                      // RS - execute query
        {
            if (rs.next())                                              // Get row?
            {
                textFieldCourseRating.setText(rs.getString("Rating"));  // Yes, set rating in add scores text field
                textFieldCourseSlope.setText(rs.getString("Slope"));    // Set slope in add scores text field
            }              
        }                                                               // Try with resources
        catch (Exception e1)                                            // Should never happen
        {
            e1.printStackTrace();
        }
    }

    /**
     * This method adds a new row or updates an existing row
     * return
     *      true and duplicate = 0      -> normal
     *      true and duplicate = 90     -> real duplicate
     *      true and duplicate < 90     -> score added for same day
     *      true and duplicate = 98     -> SQLite error
     *      true and duplicate = 99     -> Invalid score
     *      false                       -> same day score auto-increment
     * @param query
     * @return
     * @throws SQLException 
     */
    boolean addOrUpdateDBRow(String query) throws SQLException
    {
        try (PreparedStatement pst = SQLiteConnection.connection.
                prepareStatement(query))                                // Try pst
        {
            String dateIt = ((JTextField) dateChooserAddScoresDate.
                    getDateEditor().getUiComponent()).getText();

    //      Commented code is if date key changes
    //			int day = dateChooser.getCalendar().get(Calendar.DAY_OF_MONTH);
    //			int month = dateChooser.getCalendar().get(Calendar.MONTH) + 1;	// Jan - 0, Feb - 1, ... Dec - 11
    //			int year = dateChooser.getCalendar().get(Calendar.YEAR);
    //			String dateIt = MiscMethods.dateToString(day, month, year);
            if (duplicate == 0)                                     // Same day score?
                pst.setString(1, convertTableDate(dateIt));         // No - JTable Date (MM/dd/yy) to row date (yyyy-MM-dd)
            else                                                    // Yes                                                      
            {
                pst.setString(1, convertTableDate(dateIt) + "T00:0" + Integer.toHexString(duplicate));  // Duplicate THH:M1 T00:0n
            }

            pst.setString(2, (String) comboBoxCourse.getSelectedItem());    // Course

            /*
            * 
            * 		Test first to see if tournament or 9 hole score is set
            * 		If neither, set indicator in row off.
            * 			Test for 9 hole
            * 				else test for tournament
            * 
             */
            if (!(chckbxAddScoresNineHoleScore.isSelected() || chckbxAddScoresTournamentScore.isSelected())) // T or 9?
            {
                pst.setString(3, "");						// No, Turn off, nothing special
                if ((HandicapMain.inicatorTournOrNineOnDB != null)
                        && (HandicapMain.inicatorTournOrNineOnDB.equals(HandicapMain.NINEINDICATOR)))   // Was 9 set in DB recored?
                {
                    HandicapMain.handicapPrefs.remove(HandicapMain.HANDICAPNINEHOLE);                   // Yes so we must be turning it off
                    HandicapMain.inicatorTournOrNineOnDB = null;                                        // Turn off to be safe
                }
            } 
            else                                                                    // 9 hole score?
             if (chckbxAddScoresNineHoleScore.isSelected())				// 9 hole score
                {
                    String nineHoleHang = HandicapMain.handicapPrefs.get(HandicapMain.HANDICAPNINEHOLE,
                            HandicapMain.NONH);                                     // Get 9 hole hanging from preferences
                    if (nineHoleHang.equals(HandicapMain.NONH))			// 9 hole score hanging?
                    {
                        pst.setString(3, HandicapMain.NINEINDICATOR);		// No - set in table
                        HandicapMain.handicapPrefs.put(HandicapMain.HANDICAPNINEHOLE, "yes");   // Set hanging 9 hole score
                    } 
                    else								// 2nd nine hole score, must combine
                    {
                        int newNineHole = Integer.parseInt(textFieldScore.getText());   // Score just added
                        combineNineHoleScores();                                        // Combine 2 9 hole scores

    /*
     * 		Create combined course name (Combined, first nine date, first score, second score)
     */
                        String combinedName = "Combined " + displayDateToTableDate(DisplayScores.saveDate) + " "
                                + (Integer.parseInt(textFieldScore.getText()) - newNineHole) + " "
                                + newNineHole; 						// Combined course name
                        pst.setString(2, combinedName);					// Set course to combined
                        pst.setString(3, "");						// Turn off 9 hole score indicator
                        HandicapMain.handicapPrefs.remove(HandicapMain.HANDICAPNINEHOLE);   // Set 9 hole score combined
                    }

                } 
             else                       // must be tournament
                {
                    pst.setString(3, HandicapMain.TOURNINDICATOR);          // T
                }

            String strScore, strCourseRating, strCourseSlope;

            pst.setString(4, strScore = textFieldScore.getText());		// Score

            //	Test to be sure score entered is valid
            if (!StringUtils.isInteger(strScore))
            {
                JOptionPane.showMessageDialog(null, "Score \" " + strScore
                        + "\"  is not a valid number, renenter.",
                        "Score", JOptionPane.ERROR_MESSAGE);
                duplicate = 99;                                             // This represents an invalid score
                return true;                                                // True return with duplicate = 99
            }

            pst.setString(5, strCourseRating = textFieldCourseRating.getText());    // Rating
            pst.setString(6, strCourseSlope = textFieldCourseSlope.getText());      // Slope

            pst.setString(7, calcDiffernential(strScore, strCourseRating, strCourseSlope));     // Calculate differential

    //			pst.setString(8, dateIt);       Code for separate date field @ end of row
            if (query.contains("update"))                           // Update?  Additional query field
                pst.setString(8, DisplayScores.saveDate);           // Get date from display score for update

    //        try
    //        {
            pst.execute();                                      // Execute query
        } 
        catch (SQLException e)                                  // Catch SQL exception
        {
            if (e.getErrorCode() == 19)                         // Duplicate?
            {
                int yesOrNo = JOptionPane.showConfirmDialog(null, 
                        "This is a duplicate record,\n is record for the same day?",
                        "Duplicate", JOptionPane.YES_NO_OPTION);
                if (HandicapMain.debug)                                 // <debug>
                {
                    e.printStackTrace();				// If debug, show trace
                }
                if (yesOrNo == JOptionPane.YES_OPTION)                  // Same day record?
                {
                    duplicate = duplicate + 1;                          // Yes, auto-increment
                    return false;                                       // Return to process again
                }
                else                                                    // Not same day record
                {
                    duplicate = 90;                                     // Flag as real duplicate
                    return true;                                        // Return with error
                }

            }
            else                                                        // Not duplicate, some other SQL error
            {
                JOptionPane.showMessageDialog(null, "Some sort of SQLite exception",
                        "Duplicate", JOptionPane.ERROR_MESSAGE);
                if (HandicapMain.debug)
                {
                    e.printStackTrace();			// If debug, show trace
                }
                duplicate = 98;                                 // Signal error
                return true;                                    // true with duplicate = 98
            }
        }
//        pst.close();                                            // Close Prepared Statement
        duplicate = 0;                                          // Signal AOK
        return true;
    }
    
    /**
     * This method calculates an individual score differential as follows
     * differential = (score - course rating) * (113 / course slope)
     *
     * @param String strScore
     * @param String strCourseRating
     * @param String strCourseSlope
     * @return String strDifferential
     */
    private String calcDiffernential(String strScore, String strCourseRating, String strCourseSlope)
    {
        final int BASESLOPE = 113;                                  // Base slope
        String strDifferential;                                     // Individual differential
        int intScore, intCourseSlope;                               // Score and slope
        double dblCourseRating, dblDifferential;                    // Course rating and differential

        intScore = Integer.parseInt(strScore);                      // Score as integer
        dblCourseRating = Double.parseDouble(strCourseRating);      // Course rating as double
        intCourseSlope = Integer.parseInt(strCourseSlope);          // Slope as integer

        dblDifferential = ((intScore - dblCourseRating) * BASESLOPE) / intCourseSlope;	// Calculate differential

        strDifferential = String.format("%04.1f", dblDifferential); //  Differential as nn.n

        return strDifferential;                                     // Return with String differential
    }

/**
 * This method combines 2 nine hole scores as follows Save the date, score,
 * rating, and slope Select from score table based on "9" in T column Add 2
 * scores Add 2 ratings Add 2 slopes / 2 Put in textfields and return Let
 * process as an update to 1st 9 hole score
 */
    
    private void combineNineHoleScores()
    {
        boolean haveNineHoleScore = false;                                                  // Assume no 9 hole scores hanging
        int saveNineHoleScore = Integer.parseInt(textFieldScore.getText());                 // 9 hole score just added
        double saveNineHoleRating = Double.parseDouble(textFieldCourseRating.getText());    // 9 hole rating just added
        int saveNineHoleSlope = Integer.parseInt(textFieldCourseSlope.getText());           // 9 hole slope just added
        String T_ = HandicapMain.NINEINDICATOR;				// Look for 9 hole score
        // Select * from SCORE_TBL where T = "9"                                should only be 1
        String query = "Select * from " + HandicapMain.scoreTableName + " where T = '" + T_ + "'";
        try (PreparedStatement pst = SQLiteConnection.connection.
                prepareStatement(query); 
                ResultSet rs = pst.executeQuery())                      // Resources
        {
            if (rs.next())                                              // Get 9 hole row?
            {
                haveNineHoleScore = true;                               // We have a 9 hole score
                DisplayScores.saveDate = rs.getString("DateField");     // Save date of hanging score, will set new date
                textFieldScore.setText(rs.getString("Score"));          // Save score of orig
                textFieldCourseRating.setText(rs.getString("Rating"));  // Save rating of hanging
                textFieldCourseSlope.setText(rs.getString("Slope"));    // Save slope of hanging

            }
            // Close result set
            // Close prepared statement
        }
        catch (SQLException e1)
        {
            e1.printStackTrace();
        }
        if (!haveNineHoleScore)                                                 // Find matching 9 record?
        {
            JOptionPane.showMessageDialog(null, "Houston, we have a problem");	// Cannot find hanging 9 recored
            System.exit(99);							// Hanging 9 hole, but none in table
        }
        /*
         *  Add hanging 9 and new 9 hole scores
         *  Add hanging 9 and new 9 ratings
         *  Avg hanging 9 and new 9 slope
        */
        textFieldScore.setText(Integer.toString(saveNineHoleScore 
                + Integer.parseInt(textFieldScore.getText())));             // 9 hole score from JTable
        textFieldCourseRating.setText(Double.toString(saveNineHoleRating 
                + Double.parseDouble(textFieldCourseRating.getText())));    // 9 hole rating from JTable
        textFieldCourseSlope.setText(Integer.toString((saveNineHoleSlope 
                + Integer.parseInt(textFieldCourseSlope.getText())) / 2));  // 9 hole slope from JTable
    }
    
/**
 * This method converts row date yyyy-MM-dd to JTable display date MM/dd/yy
 * @param yearMonthDay
 * @return 
 */
    
    public static String displayDateToTableDate (String yearMonthDay)
    {
        String mdy = null;                                              // String MM/dd/yy
        SimpleDateFormat sdfymd = new SimpleDateFormat("yyyy-MM-dd");   // DB row date
        SimpleDateFormat sdfmdy = new SimpleDateFormat("MM/dd/yy");     // JTable display date
        try
        {
            mdy = sdfmdy.format(sdfymd.parse(yearMonthDay));            // yyyy-MM-dd -> MM/dd/yy
        }
        catch (ParseException ex)
        {
            Logger.getLogger(AddScores.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mdy;                                                     // Return String MM/dd/yy
    }
    
/**
 * This method converts a JTable display date mm/dd/yy to DB row date yyyy-mm-dd
 * Century 80 before and 20 after current
 * @param displayDate 
 * @return  ymdDate
 */

    public static String convertTableDate(String displayDate)
    {

        String month, day, year, ymdDate;
        month = displayDate.substring(0, 2);			// Get month
        day = displayDate.substring(3, 5);			// Get day
        year = displayDate.substring(6, 8);			// Get year
        ymdDate = "20" + year + "-" + month + "-" + day;	// yyyy-MM-dd

        return ymdDate;                                         // Return String yyyy-MM-dd
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAddScoreDelete;
    public static javax.swing.JButton btnAddScoresAdd;
    private javax.swing.JButton btnAddScoresExit;
    public static javax.swing.JCheckBox chckbxAddScoresNineHoleScore;
    public static javax.swing.JCheckBox chckbxAddScoresTournamentScore;
    public static javax.swing.JComboBox<String> comboBoxCourse;
    public static com.toedter.calendar.JDateChooser dateChooserAddScoresDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelSouth;
    private javax.swing.JPanel panelWest;
    public static javax.swing.JTextField textFieldCourseRating;
    public static javax.swing.JTextField textFieldCourseSlope;
    public static javax.swing.JTextField textFieldScore;
    // End of variables declaration//GEN-END:variables
}