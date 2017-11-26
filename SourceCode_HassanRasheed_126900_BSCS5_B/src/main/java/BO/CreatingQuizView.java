/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.QuizerDao;
import Entity.Question;
import Entity.Quiz;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author hassa
 */
public class CreatingQuizView extends javax.swing.JFrame {
    
    Quiz qz=new Quiz();
    /**
     * Creates new form CreatingQuizView
     */
    public CreatingQuizView(){
        initComponents();
    }
    
    public CreatingQuizView(String qtitle, String qdesc, int maxmarks) {
        initComponents();
        this.qz.setTitle(qtitle);
        this.qz.setDescription(qdesc);
        this.qz.setTotalMarks(maxmarks);
        MCQPanel.setVisible(false);
        TFPanel.setVisible(false);
        NumPanel.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        qtypecombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        selecttypebutton = new javax.swing.JButton();
        MCQPanel = new javax.swing.JPanel();
        option4field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        option3field = new javax.swing.JTextField();
        option2field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        option1field = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        questiontextmcq = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        expectedansmcq = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addQuestionMCQ = new javax.swing.JButton();
        AddMCQBean = new javax.swing.JButton();
        TFPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        questiontexttf = new javax.swing.JTextArea();
        expectedanstf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        addQuestionTF = new javax.swing.JButton();
        AddTFBean = new javax.swing.JButton();
        NumPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        questiontextnum = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        expectedansnum = new javax.swing.JTextField();
        addQuestionNum = new javax.swing.JButton();
        AddNumBean = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(504, 500));
        setMinimumSize(new java.awt.Dimension(504, 500));
        setPreferredSize(new java.awt.Dimension(504, 500));

        qtypecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MCQ", "True/False", "Numeric" }));

        jLabel1.setText("Question Type");

        selecttypebutton.setText("Select");
        selecttypebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecttypebuttonActionPerformed(evt);
            }
        });

        jLabel2.setText("Option 4:");

        jLabel3.setText("Option 3:");

        jLabel4.setText("Option 2:");

        jLabel5.setText("Option 1:");

        questiontextmcq.setColumns(20);
        questiontextmcq.setRows(5);
        jScrollPane1.setViewportView(questiontextmcq);

        jLabel6.setText("Question:");

        expectedansmcq.setText("Select one answer from the options");

        jLabel7.setText("Expected Answer:");

        addQuestionMCQ.setText("Add Question");
        addQuestionMCQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuestionMCQActionPerformed(evt);
            }
        });

        AddMCQBean.setText("Add Bean Question");
        AddMCQBean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMCQBeanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MCQPanelLayout = new javax.swing.GroupLayout(MCQPanel);
        MCQPanel.setLayout(MCQPanelLayout);
        MCQPanelLayout.setHorizontalGroup(
            MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MCQPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MCQPanelLayout.createSequentialGroup()
                        .addGroup(MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(option2field)
                                .addComponent(option3field, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(option4field)
                                .addComponent(option1field, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MCQPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(expectedansmcq, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MCQPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddMCQBean)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addQuestionMCQ)
                .addGap(21, 21, 21))
        );
        MCQPanelLayout.setVerticalGroup(
            MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MCQPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option1field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option2field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option3field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option4field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expectedansmcq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(MCQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addQuestionMCQ)
                    .addComponent(AddMCQBean))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel8.setText("Question:");

        questiontexttf.setColumns(20);
        questiontexttf.setRows(5);
        jScrollPane2.setViewportView(questiontexttf);

        expectedanstf.setText("True or False");

        jLabel9.setText("Expected Answer:");

        addQuestionTF.setText("Add Question");
        addQuestionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuestionTFActionPerformed(evt);
            }
        });

        AddTFBean.setText("Add Bean Question");
        AddTFBean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTFBeanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TFPanelLayout = new javax.swing.GroupLayout(TFPanel);
        TFPanel.setLayout(TFPanelLayout);
        TFPanelLayout.setHorizontalGroup(
            TFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TFPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(TFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TFPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(expectedanstf)
                        .addContainerGap())
                    .addGroup(TFPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2)
                        .addGap(53, 53, 53))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TFPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddTFBean)
                .addGap(117, 117, 117))
            .addGroup(TFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TFPanelLayout.createSequentialGroup()
                    .addContainerGap(244, Short.MAX_VALUE)
                    .addComponent(addQuestionTF)
                    .addGap(14, 14, 14)))
        );
        TFPanelLayout.setVerticalGroup(
            TFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TFPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(TFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expectedanstf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddTFBean)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(TFPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TFPanelLayout.createSequentialGroup()
                    .addContainerGap(152, Short.MAX_VALUE)
                    .addComponent(addQuestionTF)
                    .addGap(21, 21, 21)))
        );

        NumPanel.setMaximumSize(new java.awt.Dimension(323, 197));
        NumPanel.setMinimumSize(new java.awt.Dimension(323, 197));

        questiontextnum.setColumns(20);
        questiontextnum.setRows(5);
        jScrollPane3.setViewportView(questiontextnum);

        jLabel10.setText("Question:");

        jLabel11.setText("Expected Answer:");

        expectedansnum.setText("Enter a numeric answer");

        addQuestionNum.setText("Add Question");
        addQuestionNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuestionNumActionPerformed(evt);
            }
        });

        AddNumBean.setText("Add Bean Question");
        AddNumBean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNumBeanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NumPanelLayout = new javax.swing.GroupLayout(NumPanel);
        NumPanel.setLayout(NumPanelLayout);
        NumPanelLayout.setHorizontalGroup(
            NumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(NumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NumPanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(expectedansnum)
                        .addContainerGap())
                    .addGroup(NumPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3)
                        .addGap(53, 53, 53))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NumPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddNumBean)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addQuestionNum)
                .addContainerGap())
        );
        NumPanelLayout.setVerticalGroup(
            NumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(NumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expectedansnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(NumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addQuestionNum)
                    .addComponent(AddNumBean))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MCQPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TFPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qtypecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(selecttypebutton)))))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(qtypecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(selecttypebutton))
                .addGap(18, 18, 18)
                .addComponent(MCQPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Creating Quiz");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecttypebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecttypebuttonActionPerformed
        // TODO add your handling code here:
        if("MCQ".equals((String)qtypecombo.getSelectedItem())){
            TFPanel.setVisible(false);
            NumPanel.setVisible(false);
            MCQPanel.setVisible(true);
        }
        else if("True/False".equals((String)qtypecombo.getSelectedItem())){
            MCQPanel.setVisible(false);
            NumPanel.setVisible(false);
            TFPanel.setVisible(true);
        }
        else if("Numeric".equals((String)qtypecombo.getSelectedItem())){
            MCQPanel.setVisible(false);
            TFPanel.setVisible(false);
            NumPanel.setVisible(true);
        }
    }//GEN-LAST:event_selecttypebuttonActionPerformed

    private void addQuestionMCQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuestionMCQActionPerformed
        // TODO add your handling code here:
        this.qz.addQuestionMCQ("MCQ", questiontextmcq.getText(), expectedansmcq.getText(), option1field.getText(), option2field.getText(), option3field.getText(), option4field.getText());
        if(this.qz.getNumOfQuestions()>=10){
            JOptionPane.showMessageDialog(null,"10 Questions added! Quiz has been created, to take the quiz sign in with a student account.");
            QuizerDao qd=new QuizerDao();
            qd.saveQuiz(this.qz);
            CreatingQuizView.this.dispose();
            InstructorView iv=new InstructorView();
            iv.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null,"Question added!");
        MCQPanel.setVisible(false);
        TFPanel.setVisible(false);
        NumPanel.setVisible(false);
        questiontextmcq.setText("");
        option1field.setText("");
        option2field.setText("");
        option3field.setText("");
        option4field.setText("");
        expectedansmcq.setText("");
        }
    }//GEN-LAST:event_addQuestionMCQActionPerformed

    private void addQuestionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuestionTFActionPerformed
        // TODO add your handling code here:
        this.qz.addQuestionTrueFalse("True/False", questiontexttf.getText(), expectedanstf.getText());
        if(this.qz.getNumOfQuestions()>=10){
            JOptionPane.showMessageDialog(null,"10 Questions added! Quiz has been created, to take the quiz sign in with a student account.");
            QuizerDao qd=new QuizerDao();
            qd.saveQuiz(this.qz);
            CreatingQuizView.this.dispose();
            InstructorView iv=new InstructorView();
            iv.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null,"Question added!");
        MCQPanel.setVisible(false);
        TFPanel.setVisible(false);
        NumPanel.setVisible(false);
        questiontexttf.setText("");
        expectedanstf.setText("");
        }
    }//GEN-LAST:event_addQuestionTFActionPerformed

    private void addQuestionNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuestionNumActionPerformed
        // TODO add your handling code here:
        this.qz.addQuestionNumeric("Numeric",questiontextnum.getText(),expectedansnum.getText());
        if(this.qz.getNumOfQuestions()>=10){
            JOptionPane.showMessageDialog(null,"10 Questions added! Quiz has been created, to take this quiz sign in with a student account.");
            QuizerDao qd=new QuizerDao();
            qd.saveQuiz(this.qz);
            CreatingQuizView.this.dispose();
            InstructorView iv=new InstructorView();
            iv.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null,"Question added!");
        MCQPanel.setVisible(false);
        TFPanel.setVisible(false);
        NumPanel.setVisible(false);
        questiontextnum.setText("");
        expectedansnum.setText("");
        }
    }//GEN-LAST:event_addQuestionNumActionPerformed

    private void AddMCQBeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMCQBeanActionPerformed
        // TODO add your handling code here:
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Question question = (Question) context.getBean("mcq");
        this.qz.addQuestionMCQ(question.type, question.text, question.expectedans, question.mcqarray[0], question.mcqarray[1], question.mcqarray[2], question.mcqarray[3]);
        if(this.qz.getNumOfQuestions()>=10){
            JOptionPane.showMessageDialog(null,"10 Questions added! Quiz has been created, to take the quiz sign in with a student account.");
            QuizerDao qd=new QuizerDao();
            qd.saveQuiz(this.qz);
            CreatingQuizView.this.dispose();
            InstructorView iv=new InstructorView();
            iv.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null,"Question added!");
        MCQPanel.setVisible(false);
        TFPanel.setVisible(false);
        NumPanel.setVisible(false);
        questiontextmcq.setText("");
        option1field.setText("");
        option2field.setText("");
        option3field.setText("");
        option4field.setText("");
        expectedansmcq.setText("");
        }
    }//GEN-LAST:event_AddMCQBeanActionPerformed

    private void AddTFBeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTFBeanActionPerformed
        // TODO add your handling code here:
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Question question = (Question) context.getBean("true_false1");
        this.qz.addQuestionTrueFalse(question.gettype(), question.gettext(), question.getexpectedans());
        if(this.qz.getNumOfQuestions()>=10){
            JOptionPane.showMessageDialog(null,"10 Questions added! Quiz has been created, to take the quiz sign in with a student account.");
            QuizerDao qd=new QuizerDao();
            qd.saveQuiz(this.qz);
            CreatingQuizView.this.dispose();
            InstructorView iv=new InstructorView();
            iv.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null,"Question added!");
        MCQPanel.setVisible(false);
        TFPanel.setVisible(false);
        NumPanel.setVisible(false);
        questiontexttf.setText("");
        expectedanstf.setText("");
        }
    }//GEN-LAST:event_AddTFBeanActionPerformed

    private void AddNumBeanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNumBeanActionPerformed
        // TODO add your handling code here:
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Question question = (Question) context.getBean("numeric");
        this.qz.addQuestionNumeric(question.gettype(), question.gettext(), question.getexpectedans());
        if(this.qz.getNumOfQuestions()>=10){
            JOptionPane.showMessageDialog(null,"10 Questions added! Quiz has been created, to take this quiz sign in with a student account.");
            QuizerDao qd=new QuizerDao();
            qd.saveQuiz(this.qz);
            CreatingQuizView.this.dispose();
            InstructorView iv=new InstructorView();
            iv.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null,"Question added!");
        MCQPanel.setVisible(false);
        TFPanel.setVisible(false);
        NumPanel.setVisible(false);
        questiontextnum.setText("");
        expectedansnum.setText("");
        }
    }//GEN-LAST:event_AddNumBeanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreatingQuizView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatingQuizView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatingQuizView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatingQuizView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatingQuizView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMCQBean;
    private javax.swing.JButton AddNumBean;
    private javax.swing.JButton AddTFBean;
    private javax.swing.JPanel MCQPanel;
    private javax.swing.JPanel NumPanel;
    private javax.swing.JPanel TFPanel;
    private javax.swing.JButton addQuestionMCQ;
    private javax.swing.JButton addQuestionNum;
    private javax.swing.JButton addQuestionTF;
    private javax.swing.JTextField expectedansmcq;
    private javax.swing.JTextField expectedansnum;
    private javax.swing.JTextField expectedanstf;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField option1field;
    private javax.swing.JTextField option2field;
    private javax.swing.JTextField option3field;
    private javax.swing.JTextField option4field;
    private javax.swing.JComboBox<String> qtypecombo;
    private javax.swing.JTextArea questiontextmcq;
    private javax.swing.JTextArea questiontextnum;
    private javax.swing.JTextArea questiontexttf;
    private javax.swing.JButton selecttypebutton;
    // End of variables declaration//GEN-END:variables
}
