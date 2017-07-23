import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.dataCloningTool.entry.CloneData;
import com.dataCloningTool.model.InputModel;
import com.dataCloningTool.util.ApplicationConstants;
import com.dataCloningTool.util.CloneDataUtil;

@Component
public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField customerIds;
	private JTextField scrPassword;
	private JTextField scrUserId;
	private JTextField destUserId;
	private JTextField destPassword;
	private JTextField scrSchema;
	private JTextField destSchema;
	private JTextField frmDateText;
	private JTextField toDateText;
	String msg = null;

	private static Logger LOGGER = null;
	private static ClassPathXmlApplicationContext applciationContext = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		loadLog4J();
		applciationContext = new ClassPathXmlApplicationContext(ApplicationConstants.APPLICATION_CONTEXT);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Data Cloning Tool");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/images/clone.jpg")));
		setLocation(100, 100);
		setSize(700, 550);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 247, 212));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 84, 674, 1);
		contentPane.add(separator);	

		JPanel srcPanel = new JPanel();
		srcPanel.setBounds(38, 100, 254, 207);
		srcPanel.setBackground(new Color(250, 128, 114));
		srcPanel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.RAISED, null, null, null, null)));
		contentPane.add(srcPanel);
		srcPanel.setLayout(null);
		
		JLabel srcDataBaseLabel = new JLabel(ApplicationConstants.SRC_DB);
		srcDataBaseLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		srcDataBaseLabel.setBounds(48, 21, 155, 22);
		srcPanel.add(srcDataBaseLabel);
		
		JLabel srcDbLabel = new JLabel(ApplicationConstants.DB);
		srcDbLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		srcDbLabel.setBounds(38, 82, 46, 14);
		srcPanel.add(srcDbLabel);
		
		final JComboBox srcDbList = new JComboBox();
		srcDbList.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		srcDbList.setBounds(117, 82, 86, 20);
		srcPanel.add(srcDbList);
		srcDbList.setModel(new DefaultComboBoxModel(new String[] {ApplicationConstants.PRODUCTION, ApplicationConstants.QA}));
		
		JLabel scrUserIdLabel = new JLabel(ApplicationConstants.USER_ID);
		scrUserIdLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		scrUserIdLabel.setBounds(38, 107, 42, 14);
		srcPanel.add(scrUserIdLabel);
		
		scrUserId = new JTextField();
		scrUserId.setColumns(10);
		scrUserId.setBounds(117, 107, 86, 20);
		srcPanel.add(scrUserId);
		
		JLabel scrPassLabel = new JLabel(ApplicationConstants.PASSWORD);
		scrPassLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		scrPassLabel.setBounds(38, 132, 53, 14);
		srcPanel.add(scrPassLabel);
		
		scrPassword = new JTextField();
		scrPassword.setBounds(117, 132, 86, 20);
		srcPanel.add(scrPassword);
		scrPassword.setColumns(10);
		
		JLabel scrSchemaLabel = new JLabel(ApplicationConstants.SCHEMA);
		scrSchemaLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		scrSchemaLabel.setBounds(38, 157, 44, 14);
		srcPanel.add(scrSchemaLabel);
		
		scrSchema = new JTextField();
		scrSchema.setBounds(117, 157, 86, 20);
		srcPanel.add(scrSchema);
		scrSchema.setColumns(10);
		
		JPanel destPanel = new JPanel();
		destPanel.setBackground(new Color(250, 128, 114));
		destPanel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.RAISED, null, null, null, null)));
		destPanel.setBounds(401, 100, 254, 207);
		contentPane.add(destPanel);
		destPanel.setLayout(null);
		
		JLabel destDbLabel = new JLabel(ApplicationConstants.DEST_DB);
		destDbLabel.setBounds(35, 23, 177, 22);
		destPanel.add(destDbLabel);
		destDbLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));

		JLabel destDblabel = new JLabel(ApplicationConstants.DB);
		destDblabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		destDblabel.setBounds(38, 84, 46, 14);
		destPanel.add(destDblabel);
		
		final JComboBox destDbList = new JComboBox();
		destDbList.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		destDbList.setBounds(126, 84, 86, 20);
		destPanel.add(destDbList);
		destDbList.setModel(new DefaultComboBoxModel(new String[] {ApplicationConstants.QA, ApplicationConstants.DEV}));
		
		JLabel destUserIdLabel = new JLabel(ApplicationConstants.USER_ID);
		destUserIdLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		destUserIdLabel.setBounds(38, 107, 42, 14);
		destPanel.add(destUserIdLabel);
		
		destUserId = new JTextField();
		destUserId.setColumns(10);
		destUserId.setBounds(126, 107, 86, 20);
		destPanel.add(destUserId);
		
		JLabel destPassLabel = new JLabel(ApplicationConstants.PASSWORD);
		destPassLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		destPassLabel.setBounds(38, 132, 53, 14);
		destPanel.add(destPassLabel);
		
		destPassword = new JTextField();
		destPassword.setColumns(10);
		destPassword.setBounds(126, 132, 86, 20);
		destPanel.add(destPassword);
		
		JLabel destSchemaLabel = new JLabel(ApplicationConstants.SCHEMA);
		destSchemaLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		destSchemaLabel.setBounds(38, 157, 44, 14);
		destPanel.add(destSchemaLabel);
		
		destSchema = new JTextField();
		destSchema.setBounds(126, 157, 86, 20);
		destPanel.add(destSchema);
		destSchema.setColumns(10);		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(343, 96, 19, 257);
		contentPane.add(separator_1);
		
		JLabel customerIdLabel = new JLabel(ApplicationConstants.CUSTOMER_IDS);
		customerIdLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		customerIdLabel.setBounds(10, 364, 108, 44);
		contentPane.add(customerIdLabel);
		
		customerIds = new JTextField();
		customerIds.setBounds(117, 378, 567, 20);
		contentPane.add(customerIds);
		customerIds.setColumns(10);
		
		JLabel noteLabel = new JLabel(ApplicationConstants.CUSTOMER_ID_NOTE);
		noteLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		noteLabel.setForeground(Color.RED);
		noteLabel.setBounds(127, 409, 567, 24);
		contentPane.add(noteLabel);
		
		JButton cloneBtn = new JButton(ApplicationConstants.CLONE);
		cloneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((scrUserId.getText().isEmpty())
						|| (scrPassword.getText().isEmpty())
						|| (scrSchema.getText().isEmpty())
						|| (destUserId.getText().isEmpty())
						|| (destPassword.getText().isEmpty())
						|| (destSchema.getText().isEmpty())
						|| (customerIds.getText().isEmpty())) {
					  JOptionPane.showMessageDialog(contentPane,ApplicationConstants.MANDATORY_COLUMNS_ERROR_MSG, "Error", JOptionPane.ERROR_MESSAGE);
				} else if((srcDbList.getSelectedItem().toString()) == (destDbList.getSelectedItem().toString())) {
					  JOptionPane.showMessageDialog(contentPane, ApplicationConstants.SAME_DB_ERROR_MSG, "Error", JOptionPane.ERROR_MESSAGE);					
					} else if(CloneDataUtil.validateDate(frmDateText.getText(),toDateText.getText())){
						  JOptionPane.showMessageDialog(contentPane,ApplicationConstants.INVALID_DATE_FORMAT, "Error", JOptionPane.ERROR_MESSAGE);
					}
					else {
					InputModel inputs = (InputModel) applciationContext.getBean("inputModel");	
					inputs.setSrcDb(srcDbList.getSelectedItem().toString());
					inputs.setSrcUserId(scrUserId.getText());
					inputs.setSrcPass(scrPassword.getText());
					inputs.setSrcSchema(scrSchema.getText());
					inputs.setDestDb(destDbList.getSelectedItem().toString());
					inputs.setDestUserId(destUserId.getText());
					inputs.setDestPass(destPassword.getText());
					inputs.setDestSchema(destSchema.getText());
					inputs.setCustomerIds(customerIds.getText());
					msg = CloneDataUtil.modifyDBProp(inputs);
					if(ApplicationConstants.SUCCESS.equalsIgnoreCase(msg)){
						CloneData cloneData = (CloneData) applciationContext.getBean("cloneData");
					msg = cloneData.clone(inputs);
					}
					JOptionPane.showMessageDialog(contentPane, msg,
							"Information", JOptionPane.INFORMATION_MESSAGE);
				} 
			}
		});
		cloneBtn.setBounds(127, 444, 142, 54);
		contentPane.add(cloneBtn);
		
		JButton clearBtn = new JButton(ApplicationConstants.CLEAR);
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrUserId.setText(ApplicationConstants.BLANK);
				scrPassword.setText(ApplicationConstants.BLANK);
				scrSchema.setText(ApplicationConstants.BLANK);
				destUserId.setText(ApplicationConstants.BLANK);
				destPassword.setText(ApplicationConstants.BLANK);
				destSchema.setText(ApplicationConstants.BLANK);
				customerIds.setText(ApplicationConstants.BLANK);
				frmDateText.setText(ApplicationConstants.BLANK);
				toDateText.setText(ApplicationConstants.BLANK);
			}
		});
		clearBtn.setBounds(382, 444, 142, 54);
		contentPane.add(clearBtn);
		
		JPanel frmDatePanel = new JPanel();
		frmDatePanel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.RAISED, null, null, null, null)));
		frmDatePanel.setBounds(38, 318, 254, 35);
		frmDatePanel.setBackground(new Color(250, 128, 114));
		contentPane.add(frmDatePanel);
		frmDatePanel.setLayout(null);
		
		JLabel frmDateLabel = new JLabel("Copy From Date :");
		frmDateLabel.setBounds(10, 0, 95, 35);
		frmDateLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		frmDatePanel.add(frmDateLabel);
		
		frmDateText = new JTextField();
		frmDateText.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				frmDateText.setText(ApplicationConstants.BLANK);
				frmDateText.setForeground(Color.BLACK);				
			}
		});
		frmDateText.setBounds(117, 8, 86, 20);
		frmDateText.setText("yyyy-MM-dd");
		frmDateText.setForeground(Color.GRAY);
		frmDatePanel.add(frmDateText);
		frmDateText.setColumns(10);
		
		JPanel toDatePanel = new JPanel();
		toDatePanel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), new BevelBorder(BevelBorder.RAISED, null, null, null, null)));
		toDatePanel.setBackground(new Color(250, 128, 114));
		toDatePanel.setBounds(401, 318, 254, 35);
		contentPane.add(toDatePanel);
		toDatePanel.setLayout(null);
		
		JLabel toDateLabel = new JLabel("Copy To Date :");
		toDateLabel.setBounds(10, 0, 101, 28);
		toDateLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		toDatePanel.add(toDateLabel);	
		
		toDateText = new JTextField();
		toDateText.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				toDateText.setText(ApplicationConstants.BLANK);
				toDateText.setForeground(Color.BLACK);				
			}
		});
		toDateText.setColumns(10);
		toDateText.setBounds(126, 8, 86, 20);
		toDateText.setText("yyyy-MM-dd");
		toDateText.setForeground(Color.GRAY);
		toDatePanel.add(toDateText);
		toDateText.setColumns(10);
		
		JCheckBox chckbxCopyBillingData = new JCheckBox("");
		chckbxCopyBillingData.setBackground(new Color(244, 247, 212));
		chckbxCopyBillingData.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxCopyBillingData.setFont(new Font("Comic Sans MS", Font.PLAIN, 9));
		chckbxCopyBillingData.setBounds(10, 396, 21, 24);
		contentPane.add(chckbxCopyBillingData);
		
		JLabel lblCopyBilling = new JLabel("Copy Billing");
		lblCopyBilling.setBounds(35, 395, 69, 14);
		contentPane.add(lblCopyBilling);
		
		JLabel lblDataOnly = new JLabel("Data only");
		lblDataOnly.setBounds(35, 409, 69, 14);
		contentPane.add(lblDataOnly);
	}
	
	private static void loadLog4J() {
		PropertyConfigurator.configure(ApplicationConstants.LOG4J_PROPERTIES);
		LOGGER = Logger.getLogger(CloneData.class);
		LOGGER.info("Log4j Configured Successfully");
	}
}
