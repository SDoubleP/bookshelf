
class bookshelfMainPanel extends JPanel {
    BookshelfApp bookapp = new BookshelfApp();
    JPanel panelforFirstrow, panelforSecondrow, panelforThirdrow, panelforFourthrow, panelforFifthrow;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,thankYou;
    JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6, jtf7, jtf8, jtf9, jtf10;
    JButton add, remove, search, update, display,clear;

    bookshelfMainPanel() {
        panelforFirstrow = new JPanel();
        panelforSecondrow = new JPanel();
        panelforThirdrow = new JPanel();
        panelforFourthrow = new JPanel();
        panelforFifthrow = new JPanel();

        l1 = new JLabel("BookID");
        l2 = new JLabel("BookName");
        l3 = new JLabel("Author");
        l4 = new JLabel("Genre");
        l5 = new JLabel("BookID");
        l6 = new JLabel("BookID");
        l7 = new JLabel("BookID");
        l8 = new JLabel("BookName");
        l9 = new JLabel("Author");
        l10 = new JLabel("Genre");
        thankYou = new JLabel("Thank you so much");

        jtf1 = new JTextField(10);
        jtf2 = new JTextField(10);
        jtf3 = new JTextField(10);
        jtf4 = new JTextField(10);
        jtf5 = new JTextField(10);
        jtf6 = new JTextField(10);
        jtf7 = new JTextField(10);
        jtf8 = new JTextField(10);
        jtf9 = new JTextField(10);
        jtf10 = new JTextField(10);

        add = new JButton("Add");
        remove = new JButton("Remove");
        search = new JButton("Search");
        update = new JButton("Update");
        display = new JButton("Display Books");
        clear = new JButton("Refresh");

        panelforFirstrow.setPreferredSize(new Dimension(800, 50));
        panelforFirstrow.add(l1);
        panelforFirstrow.add(jtf1);
        panelforFirstrow.add(l2);
        panelforFirstrow.add(jtf2);
        panelforFirstrow.add(l3);
        panelforFirstrow.add(jtf3);
        panelforFirstrow.add(l4);
        panelforFirstrow.add(jtf4);
        panelforFirstrow.add(add);
        add(panelforFirstrow);

        panelforSecondrow.setPreferredSize(new Dimension(800, 50));
        panelforSecondrow.add(l5);
        panelforSecondrow.add(jtf5);
        panelforSecondrow.add(remove);
        add(panelforSecondrow);

        panelforThirdrow.setPreferredSize(new Dimension(800, 50));
        panelforThirdrow.add(l6);
        panelforThirdrow.add(jtf6);
        panelforThirdrow.add(search);
        add(panelforThirdrow);

        panelforFourthrow.setPreferredSize(new Dimension(800, 50));
        panelforFourthrow.add(l7);
        panelforFourthrow.add(jtf7);
        panelforFourthrow.add(l8);
        panelforFourthrow.add(jtf8);
        panelforFourthrow.add(l9);
        panelforFourthrow.add(jtf9);
        panelforFourthrow.add(l10);
        panelforFourthrow.add(jtf10);
        panelforFourthrow.add(update);
        add(panelforFourthrow);

        panelforFifthrow.setPreferredSize(new Dimension(800, 50));
        panelforFifthrow.add(display);
        panelforFifthrow.add(clear);
        panelforFifthrow.add(thankYou);
        add(panelforFifthrow);

        add.addActionListener(new MyActionListener());
        update.addActionListener(new MyActionListener());
        remove.addActionListener(new MyActionListener());
        display.addActionListener(new MyActionListener());
        search.addActionListener(new MyActionListener());
        clear.addActionListener(new MyActionListener());

    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object obj = e.getSource();

            if (obj == add) {
                bookapp.addBook(new Book(jtf1.getText(), jtf2.getText(), jtf3.getText(), jtf4.getText()));
            } else if (obj == display) {
                JOptionPane.showMessageDialog(null, bookapp.displayBookinfo());
            } else if (obj == search) {
                Book searchedbook = bookapp.searchbookbyID(jtf6.getText());
                JOptionPane.showMessageDialog(null, searchedbook);
            } else if (obj == remove) {
                for (Book checkingidividualbookbyid : bookapp.book) {
                    if (!jtf5.getText().equals(null)) {
                        if (checkingidividualbookbyid.getBookID().equals(jtf5.getText())) {
                            bookapp.removeBook(jtf5.getText());
                            JOptionPane.showMessageDialog(null, "Removed Successfully");
                        } else {
                            JOptionPane.showMessageDialog(null, "Not Found");
                        }
                    }
                }
                // bookapp.removeBook(jtf5.getText());
            } else if (obj == update) {
                bookapp.updatebyID(jtf7.getText(), jtf8.getText(), jtf9.getText(), jtf10.getText());
            } else if (obj == clear){
                jtf1.setText("");
                jtf2.setText("");
                jtf3.setText("");
                jtf4.setText("");
                jtf5.setText("");
                jtf6.setText("");
                jtf7.setText("");
                jtf8.setText("");
                jtf9.setText("");
                jtf10.setText("");

            }

        }
    }
}
