/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import modelo.Especie;
import modelo.Especies;
import modelo.Paises;
import modelo.Sector;
import modelo.Sectores;

import javax.swing.DefaultComboBoxModel;
import modelo.Animal;

/**
 *
 * @author Dilan
 */
public class AgregarAnimal extends javax.swing.JFrame {
    private Paises listaPaises;
    private Especies listaEspecies;
    private Sectores listaSectores;
    
    /**
     * Creates new form Agregar_Animal
     * @param listaPaises
     * @param listaEspecies
     * @param listaSectores
     */
    public AgregarAnimal(Paises listaPaises, Especies listaEspecies, Sectores listaSectores) {
        this.listaPaises = listaPaises;
        this.listaEspecies = listaEspecies;
        this.listaSectores = listaSectores;
        
        initComponents();
        // IN PROGRESS
        llenarComboSectores(this.listaSectores);
        llenarComboPaises(this.listaPaises);
        // llenarComboDieta();
        llenarComboEspecies(this.listaEspecies);
    }
    
    // Metodos //////////////////////////////////////////////////////////////////////////
    public void llenarComboPaises(Paises listaPaises){
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        
        for(int i = 0; i < listaPaises.getPaises().size(); i++){
            String opcion = (i + 1) + ". " + listaPaises.getPaises().get(i).getNombre();
            modelo.addElement(opcion);
        }
        
        paisOrigenComboBox.setModel(modelo);
    }
    
    /*public void llenarComboDieta(){
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        
        modelo.addElement("Carnívoro");
        modelo.addElement("Herbívoro");
        
        dietaComboBox.setModel(modelo);
    }*/
    
    public void llenarComboEspecies(Especies listaEspecies){
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        
        for(int i = 0; i < listaEspecies.getEspecies().size(); i++){
            // Obtener el nombre de la clase de la especie iesima
            String tipoEspecie = listaEspecies.getEspecies().get(i).getClass().getName().substring(14);
            
            String nombreEspecie = ((Especie) listaEspecies.getEspecies().get(i)).getNombre();
            
            String opcion = nombreEspecie + " (" + tipoEspecie + ")";
            
            modelo.addElement(opcion);
        }
        
        especieComboBox.setModel(modelo);
    }
    
    public void llenarComboSectores(Sectores listaSectores){
        // IN PROGRESS
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        
        String formatoOpcion = """
                            %d. Capacidad: %s / %s
                            Especies de tipo: %s
                            A cargo de %s
                        """;
        
        for(int i = 0; i < listaSectores.getSectores().size(); i++){
            // Obtener el sector iesimo del ArrayList
            Sector sector = (Sector) listaSectores.getSectores().get(i);
            
            int sectorNumero = sector.getNumero();
            int sectorCantidadAnimales = sector.getAnimales().size();
            int sectorCapacidad = sector.getCapacidad();
            
            // Obtenemos el nombre de la clase del primer animal en "Animales"
            String sectorEspeciesTipo;
            
            if(sectorCantidadAnimales > 0){
               sectorEspeciesTipo = sector.getAnimales().get(0).getClass().getName();
               
               if(sectorEspeciesTipo.endsWith("Animal")){
                   // Obtener nombre de la clase de la especie del primer animal
                   Animal primerAnimal = (Animal) sector.getAnimales().get(0);
                   
                   sectorEspeciesTipo = primerAnimal.getEspecie().getClass().getName().substring(14);
               }
            } else 
            if(sectorCantidadAnimales == 0){
                sectorEspeciesTipo = "Sector Vacio";
            } else {
                System.out.println("""
                                   How it is possible?
                                   """);
                continue;
            }
            
            String sectorEncargadoNombre = sector.getEncargado().getNombre();
            
            String opcion1 = String.format(
                    formatoOpcion, 
                    sectorNumero,
                    sectorCantidadAnimales,
                    sectorCapacidad,
                    sectorEspeciesTipo,
                    sectorEncargadoNombre
            );
            
            String opcion = "<html><body>" + sectorNumero + ". Capacidad: " + sectorCantidadAnimales + " / " + sectorCapacidad + "<br>"
                    + "Especies con dieta: " + sectorEspeciesTipo + "<br>"
                    + "A cargo de " + sectorEncargadoNombre + "<br><br>"
                    + "</body></html>";
            
            modelo.addElement(opcion);
        }
        
        sectorComboBox.setModel(modelo);
    }
    /////////////////////////////////////////////////////////////////////////////////////
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevoAnimalPanel = new javax.swing.JPanel();
        especieLabel = new javax.swing.JLabel();
        especieComboBox = new javax.swing.JComboBox<>();
        edadLabel = new javax.swing.JLabel();
        edadTextField = new javax.swing.JTextField();
        edadLabelAños = new javax.swing.JLabel();
        pesoLabelKilos = new javax.swing.JLabel();
        pesoTextField = new javax.swing.JTextField();
        pesoLabel = new javax.swing.JLabel();
        paisOrigenComboBox = new javax.swing.JComboBox<>();
        paisOrigenLabel = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        sectorLabel = new javax.swing.JLabel();
        sectorComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        nuevoAnimalPanel.setBackground(new java.awt.Color(0, 0, 0));

        especieLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        especieLabel.setForeground(new java.awt.Color(255, 255, 255));
        especieLabel.setText("Especie");

        especieComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        especieComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        especieComboBox.setToolTipText("Nombre de la especie (Dieta)");

        edadLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edadLabel.setForeground(new java.awt.Color(255, 255, 255));
        edadLabel.setText("Edad");

        edadTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edadTextField.setText("2");
        edadTextField.setToolTipText("La edad debe ser un numero entero");
        edadTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadTextFieldActionPerformed(evt);
            }
        });

        edadLabelAños.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        edadLabelAños.setForeground(new java.awt.Color(255, 255, 255));
        edadLabelAños.setText("años");

        pesoLabelKilos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pesoLabelKilos.setForeground(new java.awt.Color(255, 255, 255));
        pesoLabelKilos.setText("kilos");

        pesoTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pesoTextField.setText("20.0");
        pesoTextField.setToolTipText("Puede ser cualquier valor positivo");

        pesoLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pesoLabel.setForeground(new java.awt.Color(255, 255, 255));
        pesoLabel.setText("Peso");

        paisOrigenComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        paisOrigenComboBox.setMaximumRowCount(30);
        paisOrigenComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        paisOrigenLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        paisOrigenLabel.setForeground(new java.awt.Color(255, 255, 255));
        paisOrigenLabel.setText("Pais de Origen");

        confirmar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        sectorLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sectorLabel.setForeground(new java.awt.Color(255, 255, 255));
        sectorLabel.setText("Sector");

        sectorComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sectorComboBox.setMaximumRowCount(1500);
        sectorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sectorComboBox.setToolTipText("");
        sectorComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sectorComboBox.setName(""); // NOI18N
        sectorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectorComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nuevoAnimalPanelLayout = new javax.swing.GroupLayout(nuevoAnimalPanel);
        nuevoAnimalPanel.setLayout(nuevoAnimalPanelLayout);
        nuevoAnimalPanelLayout.setHorizontalGroup(
            nuevoAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoAnimalPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(nuevoAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevoAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sectorLabel)
                        .addComponent(paisOrigenLabel)
                        .addComponent(especieLabel)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevoAnimalPanelLayout.createSequentialGroup()
                            .addGroup(nuevoAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(nuevoAnimalPanelLayout.createSequentialGroup()
                                    .addComponent(edadLabel)
                                    .addGap(89, 89, 89))
                                .addGroup(nuevoAnimalPanelLayout.createSequentialGroup()
                                    .addComponent(edadTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(edadLabelAños)
                                    .addGap(18, 18, 18)))
                            .addGroup(nuevoAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(nuevoAnimalPanelLayout.createSequentialGroup()
                                    .addComponent(pesoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pesoLabelKilos))
                                .addComponent(pesoLabel)))
                        .addComponent(especieComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paisOrigenComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sectorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        nuevoAnimalPanelLayout.setVerticalGroup(
            nuevoAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoAnimalPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(sectorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sectorComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nuevoAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(nuevoAnimalPanelLayout.createSequentialGroup()
                        .addComponent(pesoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(nuevoAnimalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesoLabelKilos)
                            .addComponent(edadLabelAños)))
                    .addGroup(nuevoAnimalPanelLayout.createSequentialGroup()
                        .addComponent(especieLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(especieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edadLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(paisOrigenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paisOrigenComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        sectorComboBox.getAccessibleContext().setAccessibleName("sectorComboBox");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevoAnimalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nuevoAnimalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        dispose();
    }//GEN-LAST:event_confirmarActionPerformed

    private void edadTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadTextFieldActionPerformed

    private void sectorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectorComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JLabel edadLabelAños;
    private javax.swing.JTextField edadTextField;
    private javax.swing.JComboBox<String> especieComboBox;
    private javax.swing.JLabel especieLabel;
    private javax.swing.JPanel nuevoAnimalPanel;
    private javax.swing.JComboBox<String> paisOrigenComboBox;
    private javax.swing.JLabel paisOrigenLabel;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JLabel pesoLabelKilos;
    private javax.swing.JTextField pesoTextField;
    private javax.swing.JComboBox<String> sectorComboBox;
    private javax.swing.JLabel sectorLabel;
    // End of variables declaration//GEN-END:variables
}
