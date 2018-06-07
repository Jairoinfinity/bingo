package bingo;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {

    int[] jp1 = new int[15];
    int[] jp1Linea1 = new int[5];
    int[] jp1Linea2 = new int[5];
    int[] jp1Linea3 = new int[5];
    int[] jp2 = new int[15];
    int[] jp2Linea1 = new int[5];
    int[] jp2Linea2 = new int[5];
    int[] jp2Linea3 = new int[5];
    int[] nTablon = new int[90];

    public Juego() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        n1 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        n6 = new javax.swing.JLabel();
        n7 = new javax.swing.JLabel();
        n8 = new javax.swing.JLabel();
        n9 = new javax.swing.JLabel();
        n10 = new javax.swing.JLabel();
        n11 = new javax.swing.JLabel();
        n12 = new javax.swing.JLabel();
        n13 = new javax.swing.JLabel();
        n14 = new javax.swing.JLabel();
        n15 = new javax.swing.JLabel();
        n90 = new javax.swing.JLabel();
        n16 = new javax.swing.JLabel();
        n17 = new javax.swing.JLabel();
        n18 = new javax.swing.JLabel();
        n19 = new javax.swing.JLabel();
        n20 = new javax.swing.JLabel();
        n21 = new javax.swing.JLabel();
        n22 = new javax.swing.JLabel();
        n23 = new javax.swing.JLabel();
        n24 = new javax.swing.JLabel();
        n25 = new javax.swing.JLabel();
        n26 = new javax.swing.JLabel();
        n27 = new javax.swing.JLabel();
        n28 = new javax.swing.JLabel();
        n29 = new javax.swing.JLabel();
        n30 = new javax.swing.JLabel();
        n31 = new javax.swing.JLabel();
        n32 = new javax.swing.JLabel();
        n33 = new javax.swing.JLabel();
        n34 = new javax.swing.JLabel();
        n35 = new javax.swing.JLabel();
        n36 = new javax.swing.JLabel();
        n37 = new javax.swing.JLabel();
        n38 = new javax.swing.JLabel();
        n39 = new javax.swing.JLabel();
        n40 = new javax.swing.JLabel();
        n41 = new javax.swing.JLabel();
        n42 = new javax.swing.JLabel();
        n43 = new javax.swing.JLabel();
        n44 = new javax.swing.JLabel();
        n45 = new javax.swing.JLabel();
        n46 = new javax.swing.JLabel();
        n47 = new javax.swing.JLabel();
        n48 = new javax.swing.JLabel();
        n49 = new javax.swing.JLabel();
        n50 = new javax.swing.JLabel();
        n51 = new javax.swing.JLabel();
        n52 = new javax.swing.JLabel();
        n53 = new javax.swing.JLabel();
        n54 = new javax.swing.JLabel();
        n55 = new javax.swing.JLabel();
        n56 = new javax.swing.JLabel();
        n57 = new javax.swing.JLabel();
        n58 = new javax.swing.JLabel();
        n59 = new javax.swing.JLabel();
        n60 = new javax.swing.JLabel();
        n61 = new javax.swing.JLabel();
        n62 = new javax.swing.JLabel();
        n63 = new javax.swing.JLabel();
        n64 = new javax.swing.JLabel();
        n65 = new javax.swing.JLabel();
        n66 = new javax.swing.JLabel();
        n67 = new javax.swing.JLabel();
        n68 = new javax.swing.JLabel();
        n69 = new javax.swing.JLabel();
        n70 = new javax.swing.JLabel();
        n71 = new javax.swing.JLabel();
        n72 = new javax.swing.JLabel();
        n73 = new javax.swing.JLabel();
        n74 = new javax.swing.JLabel();
        n75 = new javax.swing.JLabel();
        n76 = new javax.swing.JLabel();
        n77 = new javax.swing.JLabel();
        n78 = new javax.swing.JLabel();
        n79 = new javax.swing.JLabel();
        n80 = new javax.swing.JLabel();
        n81 = new javax.swing.JLabel();
        n82 = new javax.swing.JLabel();
        n83 = new javax.swing.JLabel();
        n84 = new javax.swing.JLabel();
        n85 = new javax.swing.JLabel();
        n86 = new javax.swing.JLabel();
        n87 = new javax.swing.JLabel();
        n88 = new javax.swing.JLabel();
        n89 = new javax.swing.JLabel();
        n1JP1 = new javax.swing.JLabel();
        n2JP1 = new javax.swing.JLabel();
        n3JP1 = new javax.swing.JLabel();
        n4JP1 = new javax.swing.JLabel();
        n5JP1 = new javax.swing.JLabel();
        n6JP1 = new javax.swing.JLabel();
        n7JP1 = new javax.swing.JLabel();
        n8JP1 = new javax.swing.JLabel();
        n9JP1 = new javax.swing.JLabel();
        n10JP1 = new javax.swing.JLabel();
        n11JP1 = new javax.swing.JLabel();
        n12JP1 = new javax.swing.JLabel();
        n13JP1 = new javax.swing.JLabel();
        n14JP1 = new javax.swing.JLabel();
        n15JP1 = new javax.swing.JLabel();
        jp2N1 = new javax.swing.JLabel();
        jp2N2 = new javax.swing.JLabel();
        jp2N3 = new javax.swing.JLabel();
        jp2N4 = new javax.swing.JLabel();
        jp2N5 = new javax.swing.JLabel();
        jp2N6 = new javax.swing.JLabel();
        jp2N7 = new javax.swing.JLabel();
        jp2N8 = new javax.swing.JLabel();
        jp2N9 = new javax.swing.JLabel();
        jp2N10 = new javax.swing.JLabel();
        jp2N11 = new javax.swing.JLabel();
        jp2N12 = new javax.swing.JLabel();
        jp2N13 = new javax.swing.JLabel();
        jp2N14 = new javax.swing.JLabel();
        jp2N15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pj1 = new javax.swing.JLabel();
        Bingo = new javax.swing.JLabel();
        NumerosTablon = new javax.swing.JLabel();
        CartonPJ1 = new javax.swing.JLabel();
        pj2 = new javax.swing.JLabel();
        CartonPJ2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1054, 579));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 308, 30, 30));

        n2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 308, 30, 30));

        n3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 308, 30, 30));

        n4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 308, 30, 30));

        n5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 308, 30, 30));

        n6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 308, 30, 30));

        n7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 308, 30, 30));

        n8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 308, 30, 30));

        n9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 308, 30, 30));

        n10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n10, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 308, 30, 30));

        n11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n11, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 308, 30, 30));

        n12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n12, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 308, 30, 30));

        n13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 308, 30, 30));

        n14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n14, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 308, 30, 30));

        n15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n15, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 308, 30, 30));

        n90.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n90, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 483, 30, 30));

        n16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n16, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 343, 30, 30));

        n17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n17, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 343, 30, 30));

        n18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 343, 30, 30));

        n19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n19, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 343, 30, 30));

        n20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n20, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 343, 30, 30));

        n21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n21, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 343, 30, 30));

        n22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n22, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 343, 30, 30));

        n23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 343, 30, 30));

        n24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n24, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 343, 30, 30));

        n25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n25, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 343, 30, 30));

        n26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n26, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 343, 30, 30));

        n27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n27, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 343, 30, 30));

        n28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n28, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 343, 30, 30));

        n29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n29, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 343, 30, 30));

        n30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n30, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 343, 30, 30));

        n31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n31, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 378, 30, 30));

        n32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n32, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 378, 30, 30));

        n33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 378, 30, 30));

        n34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n34, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 378, 30, 30));

        n35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n35, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 378, 30, 30));

        n36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n36, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 378, 30, 30));

        n37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n37, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 378, 30, 30));

        n38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n38, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 378, 30, 30));

        n39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n39, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 378, 30, 30));

        n40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n40, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 378, 30, 30));

        n41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n41, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 378, 30, 30));

        n42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n42, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 378, 30, 30));

        n43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n43, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 378, 30, 30));

        n44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n44, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 378, 30, 30));

        n45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n45, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 378, 30, 30));

        n46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n46, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 413, 30, 30));

        n47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n47, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 413, 30, 30));

        n48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n48, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 413, 30, 30));

        n49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n49, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 413, 30, 30));

        n50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n50, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 413, 30, 30));

        n51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n51, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 413, 30, 30));

        n52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n52, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 413, 30, 30));

        n53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n53, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 413, 30, 30));

        n54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n54, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 413, 30, 30));

        n55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n55, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 413, 30, 30));

        n56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n56, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 413, 30, 30));

        n57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n57, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 413, 30, 30));

        n58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n58, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 413, 30, 30));

        n59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n59, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 413, 30, 30));

        n60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n60, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 413, 30, 30));

        n61.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n61, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 448, 30, 30));

        n62.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n62, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 448, 30, 30));

        n63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n63, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 448, 30, 30));

        n64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n64, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 448, 30, 30));

        n65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n65, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 448, 30, 30));

        n66.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n66, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 448, 30, 30));

        n67.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n67, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 448, 30, 30));

        n68.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n68, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 448, 30, 30));

        n69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n69, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 448, 30, 30));

        n70.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n70, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 448, 30, 30));

        n71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n71, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 448, 30, 30));

        n72.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n72, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 448, 30, 30));

        n73.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n73, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 448, 30, 30));

        n74.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n74, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 448, 30, 30));

        n75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n75, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 448, 30, 30));

        n76.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n76, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 483, 30, 30));

        n77.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n77, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 483, 30, 30));

        n78.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n78, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 483, 30, 30));

        n79.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n79, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 483, 30, 30));

        n80.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n80, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 483, 30, 30));

        n81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n81, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 483, 30, 30));

        n82.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n82, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 483, 30, 30));

        n83.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n83, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 483, 30, 30));

        n84.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n84, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 483, 30, 30));

        n85.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n85, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 483, 30, 30));

        n86.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n86, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 483, 30, 30));

        n87.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n87, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 483, 30, 30));

        n88.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n88, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 483, 30, 30));

        n89.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        n89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n89, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 483, 30, 30));

        n1JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n1JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n1JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 44, 50, 60));

        n2JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n2JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n2JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 44, 50, 60));

        n3JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n3JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n3JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 44, 50, 60));

        n4JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n4JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n4JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 44, 50, 60));

        n5JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n5JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n5JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 44, 50, 60));

        n6JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n6JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n6JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 103, 50, 60));

        n7JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n7JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n7JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 103, 50, 60));

        n8JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n8JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n8JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(873, 103, 50, 60));

        n9JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n9JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n9JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 103, 50, 60));

        n10JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n10JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n10JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 103, 50, 60));

        n11JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n11JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n11JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 161, 50, 60));

        n12JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n12JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n12JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 161, 50, 60));

        n13JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n13JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n13JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 161, 50, 60));

        n14JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n14JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n14JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(873, 161, 50, 60));

        n15JP1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        n15JP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(n15JP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 161, 50, 60));

        jp2N1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N1, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 295, 50, 60));

        jp2N2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N2, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 295, 50, 60));

        jp2N3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N3, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 295, 50, 60));

        jp2N4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N4, new org.netbeans.lib.awtextra.AbsoluteConstraints(877, 295, 50, 60));

        jp2N5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N5, new org.netbeans.lib.awtextra.AbsoluteConstraints(978, 295, 50, 60));

        jp2N6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N6, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 352, 50, 60));

        jp2N7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N7, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 352, 50, 60));

        jp2N8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N8, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 352, 50, 60));

        jp2N9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N9, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 352, 50, 60));

        jp2N10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N10, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 352, 50, 60));

        jp2N11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N11, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 412, 50, 60));

        jp2N12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N12, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 412, 50, 60));

        jp2N13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N13, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 412, 50, 60));

        jp2N14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N14, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 412, 50, 60));

        jp2N15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jp2N15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jp2N15, new org.netbeans.lib.awtextra.AbsoluteConstraints(978, 412, 50, 60));

        jButton1.setText("Empezar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 360, -1));

        jButton2.setText("Generar otro numero");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 360, -1));

        pj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBingo/j1.png"))); // NOI18N
        getContentPane().add(pj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 500, 30));

        Bingo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBingo/bingo2 (1).jpg"))); // NOI18N
        getContentPane().add(Bingo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        NumerosTablon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBingo/numeros.png"))); // NOI18N
        getContentPane().add(NumerosTablon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 550, 300));

        CartonPJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBingo/bingo.png"))); // NOI18N
        getContentPane().add(CartonPJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        pj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBingo/j2.png"))); // NOI18N
        getContentPane().add(pj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 232, 500, 40));

        CartonPJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBingo/bingoi.png"))); // NOI18N
        getContentPane().add(CartonPJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 500, 220));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgBingo/bg.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 414, 1030, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        resetJuego(nTablon);
        genPJ(jp1);
        añadirLineas(jp1,jp1Linea1,jp1Linea2,jp1Linea3);
        genPJ(jp2);
        añadirLineas(jp2,jp2Linea1,jp2Linea2,jp2Linea3);
        mostrarCartonPJ1(jp1);
        mostrarCartonPJ2(jp2);
        jugar();
        jButton1.setVisible(false);
        
        
        //JOptionPane.showMessageDialog(null,"Partida empezada");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jugar();

    }//GEN-LAST:event_jButton2ActionPerformed

    public void jugar() {

        generarNumTablon(nTablon);

        if (p1 == 15 && p2 == 15) {
            jButton1.setVisible(true);
            JOptionPane.showMessageDialog(null, "Empate!!!");
        } else if (p1 == 15) {
            jButton1.setVisible(true);
            JOptionPane.showMessageDialog(null, "El jugador 1 es el ganador!!!");
        } else if (p2 == 15) {
            jButton1.setVisible(true);
            JOptionPane.showMessageDialog(null, "El jugador 2 es el ganador!!!");
        }

    }

    public void genPJ(int[] array) {
        int nunRand;
        boolean libre = false;
        for (int i = 0; i < array.length; i++) {
            do {
                nunRand = (int) (Math.random() * 91 - 1) + 1;
                libre = comprobarArray(array, nunRand);
            } while (libre == false);

            array[i] = nunRand;
        }
    }

    public boolean comprobarArray(int[] array, int numero) {
        boolean libre = true;
        boolean encontrado = false;

        for (int i = 0; i < array.length && encontrado == false; i++) {
            if (array[i] == numero) {
                libre = false;
                encontrado = true;
            }
        }

        return libre;
    }

    public void generarNumTablon(int[] array) {
        int nunRand;
        boolean libre = false;

        do {
            nunRand = (int) (Math.random() * 91 - 1) + 1;
            libre = comprobarArray(array, nunRand);
        } while (libre == false);

        array[nmt] = nunRand;
        comprobarPJ1(jp1, nunRand);
        comprobarPJ2(jp2, nunRand);
        numTablob(nunRand);
        nmt++;
    }

    public void comprobarPJ2(int[] array, int nun) {
        boolean encontrado = false;
        for (int i = 0; i < array.length && encontrado == false; i++) {
            if (array[i] == nun) {
                numTablobColorPJ2(i);
                
                if(linea == false){
                    comprobarLineaPJ2(nun, jp2Linea1, jp2Linea2, jp2Linea3);
                }
                
                encontrado = true;
                p2++;
            }
        }
    }

    public void comprobarPJ1(int[] array, int nun) {
        boolean encontrado = false;
        for (int i = 0; i < array.length && encontrado == false; i++) {
            if (array[i] == nun) {
                numTablobColorPJ1(i);
                
                if(linea == false){
                    comprobarLineaPJ1(nun, jp1Linea1, jp1Linea2, jp1Linea3);
                }
                
                encontrado = true;
                p1++;
            }
        }
    }
    
    public void añadirLineas(int[] array, int[] linea1, int[] linea2, int[] linea3){
        int contador = 0;
        for(int i = 0; i < 5; i++){
            linea1[i] = array[i];
        }
        contador = 0;
        for(int i = 5; i < 10; i++){
                linea2[contador] = array[i];
                contador++;
        }
        contador = 0;
        for(int i = 10; i < array.length; i++){
            linea3[contador] = array[i];
            contador++;
        }
        
    }
    
    public void comprobarLineaPJ1(int nun, int[] linea1, int[] linea2, int[] linea3){
        boolean continuar = true;
        
        for(int i = 0; i < linea1.length && continuar == true; i++){
            if (linea1[i] == nun) {
                continuar = false;
                p1Linea1++;
            }
        }
        
        for(int i = 0; i < linea2.length && continuar == true; i++){
            if (linea2[i] == nun) {
                continuar = false;
                p1Linea2++;
            }
        }
        
        for(int i = 0; i < linea3.length && continuar == true; i++){
            if (linea3[i] == nun) {
                continuar = false;
                p1Linea3++;
            }
        }
        
        if(p1Linea1 == 5){
            linea = true;
            JOptionPane.showMessageDialog(null, "El jugador 1 ha hecho linea en la primera linea!!!");
        }else if(p1Linea2 == 5){
            linea = true;
            JOptionPane.showMessageDialog(null, "El jugador 1 ha hecho linea en la segunda linea!!!");
        }else if(p1Linea3 == 5){
            linea = true;
            JOptionPane.showMessageDialog(null, "El jugador 1 ha hecho linea en la tercera linea!!!");
        }
    }
    
    public void comprobarLineaPJ2(int nun, int[] linea1, int[] linea2, int[] linea3){
        boolean continuar = true;
        
        for(int i = 0; i < linea1.length && continuar == true; i++){
            if (linea1[i] == nun) {
                continuar = false;
                p2Linea1++;
            }
        }
        
        for(int i = 0; i < linea2.length && continuar == true; i++){
            if (linea2[i] == nun) {
                continuar = false;
                p2Linea2++;
            }
        }
        
        for(int i = 0; i < linea3.length && continuar == true; i++){
            if (linea3[i] == nun) {
                continuar = false;
                p2Linea3++;
            }
        }
        
        if(p2Linea1 == 5){
            linea = true;
            JOptionPane.showMessageDialog(null, "El jugador 2 ha hecho linea en la primera linea!!!");
        }else if(p2Linea2 == 5){
            linea = true;
            JOptionPane.showMessageDialog(null, "El jugador 2 ha hecho linea en la segunda linea!!!");
        }else if(p2Linea3 == 5){
            linea = true;
            JOptionPane.showMessageDialog(null, "El jugador 2 ha hecho linea en la tercera linea!!!");
        }
    }

    public void numTablobColorPJ2(int nun) {
        switch (nun) {
            case 1:
                jp2N2.setForeground(Color.RED);
                break;
            case 2:
                jp2N3.setForeground(Color.RED);
                break;
            case 3:
                jp2N4.setForeground(Color.RED);
                break;
            case 4:
                jp2N5.setForeground(Color.RED);
                break;
            case 5:
                jp2N6.setForeground(Color.RED);
                break;
            case 6:
                jp2N7.setForeground(Color.RED);
                break;
            case 7:
                jp2N8.setForeground(Color.RED);
                break;
            case 8:
                jp2N9.setForeground(Color.RED);
                break;
            case 9:
                jp2N10.setForeground(Color.RED);
                break;
            case 10:
                jp2N11.setForeground(Color.RED);
                break;
            case 11:
                jp2N12.setForeground(Color.RED);
                break;
            case 12:
                jp2N13.setForeground(Color.RED);
                break;
            case 13:
                jp2N14.setForeground(Color.RED);
                break;
            case 14:
                jp2N15.setForeground(Color.RED);
                break;
            case 0:
                jp2N1.setForeground(Color.RED);
                break;
            default:
                System.out.println("Error: numero no encontrado.");
        }
    }

    public void numTablobColorPJ1(int nun) {
        switch (nun) {
            case 1:
                n2JP1.setForeground(Color.RED);
                break;
            case 2:
                n3JP1.setForeground(Color.RED);
                break;
            case 3:
                n4JP1.setForeground(Color.RED);
                break;
            case 4:
                n5JP1.setForeground(Color.RED);
                break;
            case 5:
                n6JP1.setForeground(Color.RED);
                break;
            case 6:
                n7JP1.setForeground(Color.RED);
                break;
            case 7:
                n8JP1.setForeground(Color.RED);
                break;
            case 8:
                n9JP1.setForeground(Color.RED);
                break;
            case 9:
                n10JP1.setForeground(Color.RED);
                break;
            case 10:
                n11JP1.setForeground(Color.RED);
                break;
            case 11:
                n12JP1.setForeground(Color.RED);
                break;
            case 12:
                n13JP1.setForeground(Color.RED);
                break;
            case 13:
                n14JP1.setForeground(Color.RED);
                break;
            case 14:
                n15JP1.setForeground(Color.RED);
                break;
            case 0:
                n1JP1.setForeground(Color.RED);
                break;
            default:
                System.out.println("Error: numero no encontrado.");
        }
    }

    public void numTablob(int nun) {
        switch (nun) {
            case 1:
                n1.setText("" + 1);
                break;
            case 2:
                n2.setText("" + 2);
                break;
            case 3:
                n3.setText("" + 3);
                break;
            case 4:
                n4.setText("" + 4);
                break;
            case 5:
                n5.setText("" + 5);
                break;
            case 6:
                n6.setText("" + 6);
                break;
            case 7:
                n7.setText("" + 7);
                break;
            case 8:
                n8.setText("" + 8);
                break;
            case 9:
                n9.setText("" + 9);
                break;
            case 10:
                n10.setText("" + 10);
                break;
            case 11:
                n11.setText("" + 11);
                break;
            case 12:
                n12.setText("" + 12);
                break;
            case 13:
                n13.setText("" + 13);
                break;
            case 14:
                n14.setText("" + 14);
                break;
            case 15:
                n15.setText("" + 15);
                break;
            case 16:
                n16.setText("" + 16);
                break;
            case 17:
                n17.setText("" + 17);
                break;
            case 18:
                n18.setText("" + 18);
                break;
            case 19:
                n19.setText("" + 19);
                break;
            case 20:
                n20.setText("" + 20);
                break;
            case 21:
                n21.setText("" + 21);
                break;
            case 23:
                n23.setText("" + 23);
                break;
            case 24:
                n24.setText("" + 24);
                break;
            case 25:
                n25.setText("" + 25);
                break;
            case 26:
                n26.setText("" + 26);
                break;
            case 27:
                n27.setText("" + 27);
                break;
            case 28:
                n28.setText("" + 28);
                break;
            case 29:
                n29.setText("" + 29);
                break;
            case 30:
                n30.setText("" + 30);
                break;
            case 31:
                n31.setText("" + 31);
                break;
            case 32:
                n32.setText("" + 32);
                break;
            case 33:
                n33.setText("" + 33);
                break;
            case 22:
                n22.setText("" + 22);
                break;
            case 34:
                n34.setText("" + 34);
                break;
            case 35:
                n35.setText("" + 35);
                break;
            case 36:
                n36.setText("" + 36);
                break;
            case 37:
                n37.setText("" + 37);
                break;
            case 38:
                n38.setText("" + 38);
                break;
            case 39:
                n39.setText("" + 39);
                break;
            case 40:
                n40.setText("" + 40);
                break;
            case 41:
                n41.setText("" + 41);
                break;
            case 42:
                n42.setText("" + 42);
                break;
            case 43:
                n43.setText("" + 43);
                break;
            case 44:
                n44.setText("" + 44);
                break;
            case 45:
                n45.setText("" + 45);
                break;
            case 46:
                n46.setText("" + 46);
                break;
            case 47:
                n47.setText("" + 47);
                break;
            case 48:
                n48.setText("" + 48);
                break;
            case 49:
                n49.setText("" + 49);
                break;
            case 50:
                n50.setText("" + 50);
                break;
            case 51:
                n51.setText("" + 51);
                break;
            case 52:
                n52.setText("" + 52);
                break;
            case 53:
                n53.setText("" + 53);
                break;
            case 54:
                n54.setText("" + 54);
                break;
            case 55:
                n55.setText("" + 55);
                break;
            case 56:
                n56.setText("" + 56);
                break;
            case 57:
                n57.setText("" + 57);
                break;
            case 58:
                n58.setText("" + 58);
                break;
            case 59:
                n59.setText("" + 59);
                break;
            case 60:
                n60.setText("" + 60);
                break;
            case 61:
                n61.setText("" + 61);
                break;
            case 62:
                n62.setText("" + 62);
                break;
            case 63:
                n63.setText("" + 63);
                break;
            case 64:
                n64.setText("" + 64);
                break;
            case 65:
                n65.setText("" + 65);
                break;
            case 66:
                n66.setText("" + 66);
                break;
            case 67:
                n67.setText("" + 67);
                break;
            case 68:
                n68.setText("" + 68);
                break;
            case 69:
                n69.setText("" + 69);
                break;
            case 70:
                n70.setText("" + 70);
                break;
            case 71:
                n71.setText("" + 71);
                break;
            case 72:
                n72.setText("" + 72);
                break;
            case 73:
                n73.setText("" + 73);
                break;
            case 74:
                n74.setText("" + 74);
                break;
            case 75:
                n75.setText("" + 75);
                break;
            case 76:
                n76.setText("" + 76);
                break;
            case 77:
                n77.setText("" + 77);
                break;
            case 78:
                n78.setText("" + 78);
                break;
            case 79:
                n79.setText("" + 79);
                break;
            case 80:
                n80.setText("" + 80);
                break;
            case 81:
                n81.setText("" + 81);
                break;
            case 82:
                n82.setText("" + 82);
                break;
            case 83:
                n83.setText("" + 83);
                break;
            case 84:
                n84.setText("" + 84);
                break;
            case 85:
                n85.setText("" + 85);
                break;
            case 86:
                n86.setText("" + 86);
                break;
            case 87:
                n87.setText("" + 87);
                break;
            case 88:
                n88.setText("" + 88);
                break;
            case 89:
                n89.setText("" + 89);
                break;
            case 90:
                n90.setText("" + 90);
                break;
            default:
                System.out.println("Error: numero no encontrado.");
        }
    }

    public void resetJuego(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }

        p1Linea1 = 0;
        p1Linea2 = 0;
        p1Linea3 = 0;
        p2Linea1 = 0;
        p2Linea2 = 0;
        p2Linea3 = 0;
        nmt = 0;
        maxTab = 1;
        linea = false;
        n1.setText("");
        n2.setText("");
        n3.setText("");
        n4.setText("");
        n5.setText("");
        n6.setText("");
        n7.setText("");
        n8.setText("");
        n9.setText("");
        n10.setText("");
        n11.setText("");
        n12.setText("");
        n13.setText("");
        n14.setText("");
        n15.setText("");
        n16.setText("");
        n17.setText("");
        n18.setText("");
        n19.setText("");
        n20.setText("");
        n21.setText("");
        n22.setText("");
        n23.setText("");
        n24.setText("");
        n25.setText("");
        n26.setText("");
        n27.setText("");
        n28.setText("");
        n29.setText("");
        n30.setText("");
        n31.setText("");
        n32.setText("");
        n33.setText("");
        n34.setText("");
        n35.setText("");
        n36.setText("");
        n37.setText("");
        n38.setText("");
        n39.setText("");
        n40.setText("");
        n41.setText("");
        n42.setText("");
        n43.setText("");
        n44.setText("");
        n45.setText("");
        n46.setText("");
        n47.setText("");
        n48.setText("");
        n49.setText("");
        n50.setText("");
        n51.setText("");
        n52.setText("");
        n53.setText("");
        n54.setText("");
        n55.setText("");
        n56.setText("");
        n57.setText("");
        n58.setText("");
        n59.setText("");
        n60.setText("");
        n61.setText("");
        n62.setText("");
        n63.setText("");
        n64.setText("");
        n65.setText("");
        n66.setText("");
        n67.setText("");
        n68.setText("");
        n69.setText("");
        n70.setText("");
        n71.setText("");
        n72.setText("");
        n73.setText("");
        n74.setText("");
        n75.setText("");
        n76.setText("");
        n77.setText("");
        n78.setText("");
        n79.setText("");
        n80.setText("");
        n81.setText("");
        n82.setText("");
        n83.setText("");
        n84.setText("");
        n85.setText("");
        n86.setText("");
        n87.setText("");
        n88.setText("");
        n89.setText("");
        n90.setText("");
        n1JP1.setForeground(Color.BLACK);
        n2JP1.setForeground(Color.BLACK);
        n3JP1.setForeground(Color.BLACK);
        n4JP1.setForeground(Color.BLACK);
        n5JP1.setForeground(Color.BLACK);
        n6JP1.setForeground(Color.BLACK);
        n7JP1.setForeground(Color.BLACK);
        n8JP1.setForeground(Color.BLACK);
        n9JP1.setForeground(Color.BLACK);
        n10JP1.setForeground(Color.BLACK);
        n11JP1.setForeground(Color.BLACK);
        n12JP1.setForeground(Color.BLACK);
        n13JP1.setForeground(Color.BLACK);
        n14JP1.setForeground(Color.BLACK);
        n15JP1.setForeground(Color.BLACK);
        jp2N1.setForeground(Color.BLACK);
        jp2N2.setForeground(Color.BLACK);
        jp2N3.setForeground(Color.BLACK);
        jp2N4.setForeground(Color.BLACK);
        jp2N5.setForeground(Color.BLACK);
        jp2N6.setForeground(Color.BLACK);
        jp2N7.setForeground(Color.BLACK);
        jp2N8.setForeground(Color.BLACK);
        jp2N9.setForeground(Color.BLACK);
        jp2N10.setForeground(Color.BLACK);
        jp2N11.setForeground(Color.BLACK);
        jp2N12.setForeground(Color.BLACK);
        jp2N13.setForeground(Color.BLACK);
        jp2N14.setForeground(Color.BLACK);
        jp2N15.setForeground(Color.BLACK);
        p1 = 0;
        p2 = 0;

    }

    public void mostrarCartonPJ1(int[] array) {
        n1JP1.setText("" + array[0]);
        n2JP1.setText("" + array[1]);
        n3JP1.setText("" + array[2]);
        n4JP1.setText("" + array[3]);
        n5JP1.setText("" + array[4]);
        n6JP1.setText("" + array[5]);
        n7JP1.setText("" + array[6]);
        n8JP1.setText("" + array[7]);
        n9JP1.setText("" + array[8]);
        n10JP1.setText("" + array[9]);
        n11JP1.setText("" + array[10]);
        n12JP1.setText("" + array[11]);
        n13JP1.setText("" + array[12]);
        n14JP1.setText("" + array[13]);
        n15JP1.setText("" + array[14]);
    }

    public void mostrarCartonPJ2(int[] array) {
        jp2N1.setText("" + array[0]);
        jp2N2.setText("" + array[1]);
        jp2N3.setText("" + array[2]);
        jp2N4.setText("" + array[3]);
        jp2N5.setText("" + array[4]);
        jp2N6.setText("" + array[5]);
        jp2N7.setText("" + array[6]);
        jp2N8.setText("" + array[7]);
        jp2N9.setText("" + array[8]);
        jp2N10.setText("" + array[9]);
        jp2N11.setText("" + array[10]);
        jp2N12.setText("" + array[11]);
        jp2N13.setText("" + array[12]);
        jp2N14.setText("" + array[13]);
        jp2N15.setText("" + array[14]);
    }

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bingo;
    private javax.swing.JLabel CartonPJ1;
    private javax.swing.JLabel CartonPJ2;
    private javax.swing.JLabel NumerosTablon;
    private javax.swing.JLabel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jp2N1;
    private javax.swing.JLabel jp2N10;
    private javax.swing.JLabel jp2N11;
    private javax.swing.JLabel jp2N12;
    private javax.swing.JLabel jp2N13;
    private javax.swing.JLabel jp2N14;
    private javax.swing.JLabel jp2N15;
    private javax.swing.JLabel jp2N2;
    private javax.swing.JLabel jp2N3;
    private javax.swing.JLabel jp2N4;
    private javax.swing.JLabel jp2N5;
    private javax.swing.JLabel jp2N6;
    private javax.swing.JLabel jp2N7;
    private javax.swing.JLabel jp2N8;
    private javax.swing.JLabel jp2N9;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n10;
    private javax.swing.JLabel n10JP1;
    private javax.swing.JLabel n11;
    private javax.swing.JLabel n11JP1;
    private javax.swing.JLabel n12;
    private javax.swing.JLabel n12JP1;
    private javax.swing.JLabel n13;
    private javax.swing.JLabel n13JP1;
    private javax.swing.JLabel n14;
    private javax.swing.JLabel n14JP1;
    private javax.swing.JLabel n15;
    private javax.swing.JLabel n15JP1;
    private javax.swing.JLabel n16;
    private javax.swing.JLabel n17;
    private javax.swing.JLabel n18;
    private javax.swing.JLabel n19;
    private javax.swing.JLabel n1JP1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n20;
    private javax.swing.JLabel n21;
    private javax.swing.JLabel n22;
    private javax.swing.JLabel n23;
    private javax.swing.JLabel n24;
    private javax.swing.JLabel n25;
    private javax.swing.JLabel n26;
    private javax.swing.JLabel n27;
    private javax.swing.JLabel n28;
    private javax.swing.JLabel n29;
    private javax.swing.JLabel n2JP1;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n30;
    private javax.swing.JLabel n31;
    private javax.swing.JLabel n32;
    private javax.swing.JLabel n33;
    private javax.swing.JLabel n34;
    private javax.swing.JLabel n35;
    private javax.swing.JLabel n36;
    private javax.swing.JLabel n37;
    private javax.swing.JLabel n38;
    private javax.swing.JLabel n39;
    private javax.swing.JLabel n3JP1;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n40;
    private javax.swing.JLabel n41;
    private javax.swing.JLabel n42;
    private javax.swing.JLabel n43;
    private javax.swing.JLabel n44;
    private javax.swing.JLabel n45;
    private javax.swing.JLabel n46;
    private javax.swing.JLabel n47;
    private javax.swing.JLabel n48;
    private javax.swing.JLabel n49;
    private javax.swing.JLabel n4JP1;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel n50;
    private javax.swing.JLabel n51;
    private javax.swing.JLabel n52;
    private javax.swing.JLabel n53;
    private javax.swing.JLabel n54;
    private javax.swing.JLabel n55;
    private javax.swing.JLabel n56;
    private javax.swing.JLabel n57;
    private javax.swing.JLabel n58;
    private javax.swing.JLabel n59;
    private javax.swing.JLabel n5JP1;
    private javax.swing.JLabel n6;
    private javax.swing.JLabel n60;
    private javax.swing.JLabel n61;
    private javax.swing.JLabel n62;
    private javax.swing.JLabel n63;
    private javax.swing.JLabel n64;
    private javax.swing.JLabel n65;
    private javax.swing.JLabel n66;
    private javax.swing.JLabel n67;
    private javax.swing.JLabel n68;
    private javax.swing.JLabel n69;
    private javax.swing.JLabel n6JP1;
    private javax.swing.JLabel n7;
    private javax.swing.JLabel n70;
    private javax.swing.JLabel n71;
    private javax.swing.JLabel n72;
    private javax.swing.JLabel n73;
    private javax.swing.JLabel n74;
    private javax.swing.JLabel n75;
    private javax.swing.JLabel n76;
    private javax.swing.JLabel n77;
    private javax.swing.JLabel n78;
    private javax.swing.JLabel n79;
    private javax.swing.JLabel n7JP1;
    private javax.swing.JLabel n8;
    private javax.swing.JLabel n80;
    private javax.swing.JLabel n81;
    private javax.swing.JLabel n82;
    private javax.swing.JLabel n83;
    private javax.swing.JLabel n84;
    private javax.swing.JLabel n85;
    private javax.swing.JLabel n86;
    private javax.swing.JLabel n87;
    private javax.swing.JLabel n88;
    private javax.swing.JLabel n89;
    private javax.swing.JLabel n8JP1;
    private javax.swing.JLabel n9;
    private javax.swing.JLabel n90;
    private javax.swing.JLabel n9JP1;
    private javax.swing.JLabel pj1;
    private javax.swing.JLabel pj2;
    // End of variables declaration//GEN-END:variables
    private int nmt = 0;
    private int maxTab = 1;
    private int p1 = 0;
    private int p2 = 0;
    private boolean linea = false;
    private int p1Linea1 = 0;
    private int p1Linea2 = 0;
    private int p1Linea3 = 0;
    private int p2Linea1 = 0;
    private int p2Linea2 = 0;
    private int p2Linea3 = 0;
    
}
