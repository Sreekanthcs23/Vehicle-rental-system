/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package GUIpack;

/**
 *
 * @author sreekanth
 */
public class CarRow extends javax.swing.JPanel {

    /** Creates new form CarRow */
    String carname,fueltype,cartype,location,price;
    public CarRow(String carname,String cartype,String fueltype,String location,String price) {
        initComponents();
        this.carname = carname;
        this.cartype = cartype;
        this.fueltype = fueltype; 
        this.location = location;
        this.price = price;
        initUI();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        carnameLabel = new javax.swing.JLabel();
        fueltypeLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        cartypeLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUIpack/images/redcar.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        carnameLabel.setText("Car name");

        fueltypeLabel.setText("Fuel type");

        locationLabel.setText("Location");

        cartypeLabel.setText("Car type");

        jLabel6.setText("Availabel date");

        priceLabel.setText("Price");

        jButton1.setText("Book");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fueltypeLabel)
                    .addComponent(locationLabel))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceLabel)
                            .addComponent(cartypeLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton1)
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cartypeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(carnameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fueltypeLabel)
                                    .addComponent(jLabel6))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(locationLabel)
                            .addComponent(priceLabel))
                        .addGap(27, 27, 27))))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void initUI() {
        carnameLabel.setText(carname);
        cartypeLabel.setText(cartype);
        fueltypeLabel.setText(fueltype);
        locationLabel.setText(location);
        priceLabel.setText(price);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carnameLabel;
    private javax.swing.JLabel cartypeLabel;
    private javax.swing.JLabel fueltypeLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel priceLabel;
    // End of variables declaration//GEN-END:variables

}
