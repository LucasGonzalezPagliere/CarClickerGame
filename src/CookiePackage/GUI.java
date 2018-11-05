package CookiePackage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class GUI {
	
	
	//Runnable1 SparkPlug = new Runnable1();
	
	
		public JFrame frame;
		private JButton CarBtn;
		private JButton Monkey;
		private JButton SoccerMom;
		private JButton Racer;
		private JButton btnEngine;
		private JButton btnWheels;
		private JButton btnRims;
		private JButton btnNos;
		private JButton btnVisibility;
		private JButton btnTints;
		private JButton btnBodyKit;
		private JButton btnTurbocharger;
		private JButton btnGray;
		private JButton btnPurple;
		private JButton btnRed;
		private JButton btnGreen;
		private JButton btnBlue;
		public static JLabel RacesWonCount;
		int MonkeyAmount = 0;
		int MonkeyPrice = 100;
		int SoccerMomAmount =0;
		int SoccerMomPrice = 20000;
		int RacerAmount = 0;
		int RacerPrice = 100000;
	    int EnginesUpg = 0;
		int EnginePrice = 25;
		int RimsUpg = 0;
		int RimsPrice = 150;
		int VisibilityUpg = 0;
		int VisibilityPrice = 1000;
		int BodykitUpg = 0;
		int BodykitPrice = 4000;
		int WheelsUpg = 0;
		int WheelPrice = 10000;
		int NOsUpg = 0;
		int NOsPrice = 25000;
		int TintsUpg = 0;
		int TintsPrice = 110000;
		int TurbochargerUpg = 0;
		int TurbochargerPrice = 200000;
		private JLabel RacersOwned;
		private JLabel RacerCost;
		private JLabel SoccerMomsOwned;
		private JLabel SoccerMomCost;
		private JLabel MonekeysOwned;
		private JLabel MonkeyCost;
		private JLabel WheelsOwned;
		private JLabel RimsCost;
		private JLabel RimsOwned;
		private JLabel NOsCost;
		private JLabel NOsOwned;
		private JLabel VisibilityCost;
		private JLabel VisibilityOwned;
		private JLabel TintsCost;
		private JLabel TintsOwned;
		private JLabel BodykitCost;
		private JLabel BodykitOwned;
		private JLabel TurboCost;
		private JLabel TurbosOwned;
		private JLabel EngineCost;
		private JLabel EnginesOwned;
		private JLabel WheelCost;
		static Runnable1 a;
		static Runnable2 b;
		static Runnable3 c;
		static Runnable4 d;
		Thread MonkeyThread;
		Thread SoccerMomThread;
		Thread RacerThread;
		Thread ChampionshipRace;
		BufferedImage OriginalImage;
		BufferedImage Rims;
		BufferedImage newcombo;
		BufferedImage NOS;
		BufferedImage Wheels;
		BufferedImage Visibility;
		BufferedImage Tints;
		BufferedImage Bodykit;
		BufferedImage Turbo;
		BufferedImage Blue;
		BufferedImage Red;
		BufferedImage Purple;
		BufferedImage Gray;
		BufferedImage Green;
		BufferedImage Leopard;
		BufferedImage Rainbow;
		BufferedImage FourTwenty;
		//File outputfile = new File("combined.png");
		
		
		
		File outputfile;
	
		File combinor;
		
		
		static JButton btnChampionshipRace;
		
		public GUI() {
			
		
			
		    outputfile = new File("combined.png");
			
			//combinor = new File("\\WORKSPACE\\Cookie Clicker\\combined.png");
			
		    combinor = new File(System.getProperty("user.dir") + "\\combined.png"); 
			System.out.println(combinor);
			
			try {
				Rims = ImageIO.read(getClass().getResource("RimsAddOn.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				NOS = ImageIO.read(getClass().getResource("NOSAddOn.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Wheels = ImageIO.read(getClass().getResource("WheelsAddOn.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Visibility = ImageIO.read(getClass().getResource("LightsAddOn.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Tints = ImageIO.read(getClass().getResource("TintsAddOn.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Bodykit = ImageIO.read(getClass().getResource("BodyKitAddOn.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Turbo = ImageIO.read(getClass().getResource("TurboChargerAddOn.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Blue = ImageIO.read(getClass().getResource("BLUECAR.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Red = ImageIO.read(getClass().getResource("REDCAR.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Purple = ImageIO.read(getClass().getResource("PURPLECAR.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Gray = ImageIO.read(getClass().getResource("GRAYCAR.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Green = ImageIO.read(getClass().getResource("GREENCAR.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Leopard = ImageIO.read(getClass().getResource("LEOPARDCAR.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Rainbow = ImageIO.read(getClass().getResource("RAINBOWCAR.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FourTwenty = ImageIO.read(getClass().getResource("420CAR.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			a = new Runnable1();
			
			MonkeyThread = new Thread(a);
			
			b = new Runnable2();
			
			SoccerMomThread = new Thread(b);
			
			c = new Runnable3();
			
			RacerThread = new Thread(c);
			
			d = new Runnable4();
			
			ChampionshipRace = new Thread(d);
			
			
			
			frame = new JFrame("CarClicker");
			
			frame.setBounds(400, 200, 893, 732);
			
			frame.setAlwaysOnTop(false);
			
			frame.setResizable(false);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			SpringLayout springLayout = new SpringLayout();
			frame.getContentPane().setLayout(springLayout);
			
			JLabel lblRacesWon = new JLabel("Races Won:");
			springLayout.putConstraint(SpringLayout.NORTH, lblRacesWon, 27, SpringLayout.NORTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, lblRacesWon, 10, SpringLayout.WEST, frame.getContentPane());
			lblRacesWon.setFont(new Font("Platinum Beat BTN", Font.BOLD, 30));
			frame.getContentPane().add(lblRacesWon);
			
			CarBtn = new JButton("");
			springLayout.putConstraint(SpringLayout.WEST, CarBtn, 152, SpringLayout.WEST, frame.getContentPane());
			CarBtn.setBackground(Color.WHITE);
			CarBtn.addActionListener(new TheClick());
			frame.getContentPane().add(CarBtn);
			
			try {
				
				OriginalImage = ImageIO.read(getClass().getResource(
						"StartingCar.png"));
				CarBtn.setIcon(new ImageIcon(OriginalImage));
			} catch (IOException ex) {
			}
			
			
			JLabel lblDrivers = new JLabel("Drivers");
			springLayout.putConstraint(SpringLayout.WEST, lblDrivers, 10, SpringLayout.WEST, frame.getContentPane());
			lblDrivers.setFont(new Font("Platinum Beat BTN", Font.BOLD, 20));
			frame.getContentPane().add(lblDrivers);
			
			Monkey = new JButton("Monkey");
			springLayout.putConstraint(SpringLayout.NORTH, Monkey, 427, SpringLayout.NORTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, Monkey, 10, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, lblDrivers, -6, SpringLayout.NORTH, Monkey);
			Monkey.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if(Variables.RacesWon >= MonkeyPrice){
						
						Variables.RacesWon -= MonkeyPrice;
		                //Amount of upgrades bought
						MonkeyAmount += 1;
						
						//The new price after buying one
						MonkeyPrice *= 4.25;
						System.out.println("monekey upgrade bought");
						//Setting the labels
						String Count = "" + Variables.RacesWon;
						RacesWonCount.setText(Count);
						MonkeyCost.setText("Cost: " + (int)MonkeyPrice);
						MonekeysOwned.setText("Owned: " + MonkeyAmount);
					
					Runnable1.MonkeySleep = Runnable1.MonkeySleep/2;
					
					Runnable1.start = true;
					MonkeyThread.start();
					System.out.println("Monkey Button Pressed");
					
					if(MonkeyAmount == 1){
						JOptionPane.showMessageDialog(null, "Achievement: Even a monkey could do this job...");
						Achievements.Achievements.add("Achievement: Even a monkey could do this job...");
					}
					
				}}
			});
			frame.getContentPane().add(Monkey);
			
			SoccerMom = new JButton("Soccer Mom");
			springLayout.putConstraint(SpringLayout.WEST, SoccerMom, 10, SpringLayout.WEST, frame.getContentPane());
			SoccerMom.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if(Variables.RacesWon >= SoccerMomPrice){
						
						Variables.RacesWon -= SoccerMomPrice;
		                //Amount of upgrades bought
						SoccerMomAmount += 1;
						
						//The new price after buying one
						SoccerMomPrice *= 4.25;
						System.out.println("soccer mom upgrade bought");
						//Setting the labels
						String Count = "" + Variables.RacesWon;
						RacesWonCount.setText(Count);
						SoccerMomCost.setText("Cost: " + (int)SoccerMomPrice);
						SoccerMomsOwned.setText("Owned: " + SoccerMomAmount);
					
					Runnable2.SoccerMomSleep = Runnable2.SoccerMomSleep/2;
					
					Runnable2.startSoccerMom = true;
					SoccerMomThread.start();
					System.out.println("Soccer Mom Button Pressed");
					
					
					if(SoccerMomAmount == 1){
						JOptionPane.showMessageDialog(null, "Achievement: Speed up old lady");
						Achievements.Achievements.add("Achievement: Speed up old lady");
					}
				}}
			});
			
			frame.getContentPane().add(SoccerMom);
			
			Racer = new JButton("Racer");
			springLayout.putConstraint(SpringLayout.WEST, Racer, 10, SpringLayout.WEST, frame.getContentPane());
			Racer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if(Variables.RacesWon >= RacerPrice){
						
						
						Variables.RacesWon -= RacerPrice;
		                //Amount of upgrades bought
						RacerAmount += 1;
						
						//The new price after buying one
						RacerPrice *= 4.25;
						System.out.println("racer upgrade bought");
						//Setting the labels
						String Count = "" + Variables.RacesWon;
						RacesWonCount.setText(Count);
						RacerCost.setText("Cost: " + (int)RacerPrice);
						RacersOwned.setText("Owned: " + RacerAmount);
					
					Runnable3.RacerSleep = Runnable3.RacerSleep/2;
					
					Runnable3.RacerStart = true;
					RacerThread.start();
					System.out.println("racer Button Pressed");
					
					if(RacerAmount == 1){
						JOptionPane.showMessageDialog(null, "Achievement: Things are getting serious: RACER!");
						Achievements.Achievements.add("Achievement: Things are getting serious: RACER!");
					}
					
				}}
			});
			
			frame.getContentPane().add(Racer);
			
			JLabel lblUpgrades = new JLabel("Upgrades");
			springLayout.putConstraint(SpringLayout.SOUTH, CarBtn, -38, SpringLayout.NORTH, lblUpgrades);
			springLayout.putConstraint(SpringLayout.NORTH, lblUpgrades, 0, SpringLayout.NORTH, lblDrivers);
			springLayout.putConstraint(SpringLayout.WEST, lblUpgrades, 113, SpringLayout.EAST, lblDrivers);
			lblUpgrades.setFont(new Font("Platinum Beat BTN", Font.BOLD, 20));
			frame.getContentPane().add(lblUpgrades);
			
			btnEngine = new JButton("Engine");
			springLayout.putConstraint(SpringLayout.NORTH, btnEngine, 0, SpringLayout.NORTH, Monkey);
			springLayout.putConstraint(SpringLayout.WEST, btnEngine, 124, SpringLayout.EAST, Monkey);
			springLayout.putConstraint(SpringLayout.EAST, btnEngine, -577, SpringLayout.EAST, frame.getContentPane());
			btnEngine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
							
					if(Variables.RacesWon >= EnginePrice){
						Variables.RacesWon -= EnginePrice;
		                //Amount of upgrades bought
						EnginesUpg += 1;
						//How much its increments each click by
						Variables.ClickPower += 1;
						//The new price after buying one
						EnginePrice *= 1.75;
						System.out.println("engine upgrade bought");
						//Setting the labels
						String Count = "" + Variables.RacesWon;
						RacesWonCount.setText(Count);
						EngineCost.setText("Cost: " + (int)EnginePrice);
						EnginesOwned.setText("Owned: " + EnginesUpg);
					}
				}
			});
			
			frame.getContentPane().add(btnEngine);
			
			btnWheels = new JButton("Wheels");
			springLayout.putConstraint(SpringLayout.NORTH, btnWheels, 63, SpringLayout.SOUTH, btnEngine);
			springLayout.putConstraint(SpringLayout.WEST, btnWheels, 134, SpringLayout.EAST, Racer);
			springLayout.putConstraint(SpringLayout.EAST, btnWheels, -577, SpringLayout.EAST, frame.getContentPane());
			btnWheels.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
							
					if(Variables.RacesWon >= WheelPrice){
						
						
						
						int w = Math.max(OriginalImage.getWidth(), Wheels.getWidth());
						int h = Math.max(OriginalImage.getHeight(), Wheels.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage(Wheels, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File("", "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, "no file writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(null, "cant find file");
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						
				
						
						
						
						
						//Purchases the upgrade, no need to change anything here
						Variables.RacesWon -= WheelPrice;
		                //Amount of upgrades bought; no need to change
						WheelsUpg += 1;
						//How much its increments each click by; change accordingly
						Variables.ClickPower += 500;
						//The new price after buying one; may be dynamic if you choose, no real need to change though
						WheelPrice *= 1.75;
						System.out.println("wheel upgrade bought");
						//Setting the labels
						String Count = "" + Variables.RacesWon;
						RacesWonCount.setText(Count);
						WheelCost.setText("Cost: " + WheelPrice);
						WheelsOwned.setText("Owned: " + WheelsUpg);
					}
				}
			});
			
			frame.getContentPane().add(btnWheels);
			
			
			
			btnRims = new JButton("Rims");
			springLayout.putConstraint(SpringLayout.NORTH, btnRims, 0, SpringLayout.NORTH, Monkey);
			springLayout.putConstraint(SpringLayout.WEST, btnRims, 72, SpringLayout.EAST, btnEngine);
			springLayout.putConstraint(SpringLayout.SOUTH, btnRims, 0, SpringLayout.SOUTH, btnEngine);
			springLayout.putConstraint(SpringLayout.EAST, btnRims, -407, SpringLayout.EAST, frame.getContentPane());
			btnRims.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
							
				if(Variables.RacesWon >= RimsPrice){
					
						
						
						int w = Math.max(OriginalImage.getWidth(), Rims.getWidth());
						int h = Math.max(OriginalImage.getHeight(), Rims.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage(Rims, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// 
							System.out.println("no writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						//Purchases the upgrade, no need to change anything here
						Variables.RacesWon -= RimsPrice;
		                //Amount of upgrades bought; no need to change
						RimsUpg += 1;
						//How much its increments each click by; change accordingly
						Variables.ClickPower += 5;
						//The new price after buying one; may be dynamic if you choose, no real need to change though
						RimsPrice *= 1.75;
						System.out.println("rims upgrade bought");
						//Setting the labels
						String Count = "" + Variables.RacesWon;
						RacesWonCount.setText(Count);
						RimsCost.setText("Cost: " + RimsPrice);
						RimsOwned.setText("Owned: " + RimsUpg);
					}
				}
			});
			
			
			
			frame.getContentPane().add(btnRims);
			
			btnNos = new JButton("NOs");
			springLayout.putConstraint(SpringLayout.NORTH, btnNos, 0, SpringLayout.NORTH, btnWheels);
			springLayout.putConstraint(SpringLayout.WEST, btnNos, 72, SpringLayout.EAST, btnWheels);
			springLayout.putConstraint(SpringLayout.SOUTH, btnNos, 0, SpringLayout.SOUTH, btnWheels);
			btnNos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
							
					
					if(Variables.RacesWon >= NOsPrice){	

					
					int w = Math.max(OriginalImage.getWidth(), NOS.getWidth());
					int h = Math.max(OriginalImage.getHeight(), NOS.getHeight());
					BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
					
					
					
					
					Graphics g = combined.getGraphics();
					g.drawImage(OriginalImage, 0, 0, null);
					g.drawImage(NOS, 0, 0, null);
					
					
					
					
					try {
						//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
						ImageIO.write(combined, "PNG", outputfile);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("no writing occured");
						e.printStackTrace();
					}
					
					try {
						newcombo = ImageIO.read(combinor);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				CarBtn.setIcon(new ImageIcon(newcombo));
					
					OriginalImage = newcombo;
					
			
					
					
					
						//Purchases the upgrade, no need to change anything here
						Variables.RacesWon -= NOsPrice;
		                //Amount of upgrades bought; no need to change
						NOsUpg += 1;
						//How much its increments each click by; change accordingly
						Variables.ClickPower += 2500;
						//The new price after buying one; may be dynamic if you choose, no real need to change though
						NOsPrice *= 1.75;
						System.out.println("nitro upgrade bought");
						//Setting the labels
						String Count = "" + Variables.RacesWon;
						RacesWonCount.setText(Count);
						NOsCost.setText("Cost: " + NOsPrice);
						NOsOwned.setText("Owned: " + NOsUpg);
					}
				}
			});
			
			frame.getContentPane().add(btnNos);
			
			btnVisibility = new JButton("Visibility");
			springLayout.putConstraint(SpringLayout.NORTH, btnVisibility, 0, SpringLayout.NORTH, Monkey);
			springLayout.putConstraint(SpringLayout.WEST, btnVisibility, 66, SpringLayout.EAST, btnRims);
			springLayout.putConstraint(SpringLayout.SOUTH, btnVisibility, 0, SpringLayout.SOUTH, btnEngine);
			springLayout.putConstraint(SpringLayout.EAST, btnVisibility, -243, SpringLayout.EAST, frame.getContentPane());
			btnVisibility.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
							
					if(Variables.RacesWon >= VisibilityPrice){
						
						

						int w = Math.max(OriginalImage.getWidth(), Visibility.getWidth());
						int h = Math.max(OriginalImage.getHeight(), Visibility.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage(Visibility, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("no writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						
				
						
						
						
						
						
						
						
						
						
						
						
						//Purchases the upgrade, no need to change anything here
						Variables.RacesWon -= VisibilityPrice;
		                //Amount of upgrades bought; no need to change
						VisibilityUpg += 1;
						//How much its increments each click by; change accordingly
						Variables.ClickPower += 25;
						//The new price after buying one; may be dynamic if you choose, no real need to change though
						VisibilityPrice *= 2.00;
						System.out.println("visibility upgrade bought");
						//Setting the labels
						String Count = "" + Variables.RacesWon;
						RacesWonCount.setText(Count);
						VisibilityCost.setText("Cost: " + VisibilityPrice);
						VisibilityOwned.setText("Owned: " + VisibilityUpg);
					}
				}
			});
			
			frame.getContentPane().add(btnVisibility);
			
			btnTints = new JButton("Tints");
			springLayout.putConstraint(SpringLayout.WEST, btnTints, 546, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, btnNos, -66, SpringLayout.WEST, btnTints);
			springLayout.putConstraint(SpringLayout.NORTH, btnTints, -22, SpringLayout.NORTH, Racer);
			springLayout.putConstraint(SpringLayout.SOUTH, btnTints, 0, SpringLayout.SOUTH, btnWheels);
			btnTints.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
							
					if(Variables.RacesWon >= TintsPrice){
						
						

						int w = Math.max(OriginalImage.getWidth(), Tints.getWidth());
						int h = Math.max(OriginalImage.getHeight(), Tints.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage(Tints, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("no writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						
				
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						//Purchases the upgrade, no need to change anything here
						Variables.RacesWon -= TintsPrice;
		                //Amount of upgrades bought; no need to change
						TintsUpg += 1;
						//How much its increments each click by; change accordingly
						Variables.ClickPower += 10000;
						//The new price after buying one; may be dynamic if you choose, no real need to change though
						TintsPrice *= 1.75;
						System.out.println("tints upgrade bought");
						//Setting the labels
						String Count = "" + Variables.RacesWon;
						RacesWonCount.setText(Count);
						TintsCost.setText("Cost: " + TintsPrice);
						TintsOwned.setText("Owned: " + TintsUpg);
					}
				}
			});
			
			frame.getContentPane().add(btnTints);
			
			btnBodyKit = new JButton("Body Kit");
			springLayout.putConstraint(SpringLayout.NORTH, btnBodyKit, 0, SpringLayout.NORTH, Monkey);
			springLayout.putConstraint(SpringLayout.WEST, btnBodyKit, 75, SpringLayout.EAST, btnVisibility);
			springLayout.putConstraint(SpringLayout.SOUTH, btnBodyKit, 0, SpringLayout.SOUTH, btnEngine);
			springLayout.putConstraint(SpringLayout.EAST, btnBodyKit, -79, SpringLayout.EAST, frame.getContentPane());
			btnBodyKit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
							
					if(Variables.RacesWon >= BodykitPrice){
						


						int w = Math.max(OriginalImage.getWidth(), Bodykit.getWidth());
						int h = Math.max(OriginalImage.getHeight(), Bodykit.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage(Bodykit, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("no writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						
				
						
						
				
						
						
						
						
						//Purchases the upgrade, no need to change anything here
						Variables.RacesWon -= BodykitPrice;
		                //Amount of upgrades bought; no need to change
						BodykitUpg += 1;
						//How much its increments each click by; change accordingly
						Variables.ClickPower += 125;
						//The new price after buying one; may be dynamic if you choose, no real need to change though
						BodykitPrice *= 1.75;
						System.out.println("bodykit upgrade bought");
						//Setting the labels
						String Count = "" + Variables.RacesWon;
						RacesWonCount.setText(Count);
						BodykitCost.setText("Cost: " + BodykitPrice);
						BodykitOwned.setText("Owned: " + BodykitUpg);
						
						if(BodykitUpg ==1){
							JOptionPane.showMessageDialog(null, "Achievement: Now thats a clean ass whip");
							Achievements.Achievements.add("Achievement: Now thats a clean ass whip");
						}
					}
				}
			});
			
			frame.getContentPane().add(btnBodyKit);
			
			btnTurbocharger = new JButton("Turbocharger");
			springLayout.putConstraint(SpringLayout.EAST, btnTints, -75, SpringLayout.WEST, btnTurbocharger);
			springLayout.putConstraint(SpringLayout.NORTH, btnTurbocharger, -16, SpringLayout.NORTH, Racer);
			springLayout.putConstraint(SpringLayout.WEST, btnTurbocharger, 0, SpringLayout.WEST, btnBodyKit);
			springLayout.putConstraint(SpringLayout.SOUTH, btnTurbocharger, 0, SpringLayout.SOUTH, btnWheels);
			springLayout.putConstraint(SpringLayout.EAST, btnTurbocharger, -56, SpringLayout.EAST, frame.getContentPane());
			btnTurbocharger.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if(Variables.RacesWon >= TurbochargerPrice){

					int w = Math.max(OriginalImage.getWidth(), Turbo.getWidth());
					int h = Math.max(OriginalImage.getHeight(), Turbo.getHeight());
					BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
					
					
					
					
					Graphics g = combined.getGraphics();
					g.drawImage(OriginalImage, 0, 0, null);
					g.drawImage(Turbo, 0, 0, null);
					
					
					
					
					try {
						//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
						ImageIO.write(combined, "PNG", outputfile);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println("no writing occured");
						e.printStackTrace();
					}
					
					try {
						newcombo = ImageIO.read(combinor);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
				CarBtn.setIcon(new ImageIcon(newcombo));
					
					OriginalImage = newcombo;
					
			
	
							
					
						//Purchases the upgrade, no need to change anything here
						Variables.RacesWon -= TurbochargerPrice;
		                //Amount of upgrades bought; no need to change
						TurbochargerUpg += 1;
						//How much its increments each click by; change accordingly
						Variables.ClickPower += 35000;
						//The new price after buying one; may be dynamic if you choose, no real need to change though
						TurbochargerPrice *= 1.75;
						System.out.println("turbo upgrade bought");
						//Setting the labels
						String Count = "" + Variables.RacesWon;
						RacesWonCount.setText(Count);
						TurboCost.setText("Cost: " + TurbochargerPrice);
						TurbosOwned.setText("Owned: " + TurbochargerUpg);
					}
				}
			});
			
			frame.getContentPane().add(btnTurbocharger);
			
			btnBlue = new JButton("Blue");
			btnBlue.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
	
					
					if(Variables.RacesWon >= 15000 && BodykitPrice != 4000){
					
						Variables.RacesWon -= 15000;
						

						int w = Math.max(OriginalImage.getWidth(), Blue.getWidth());
						int h = Math.max(OriginalImage.getHeight(), Blue.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage(Blue, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("no writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						
				
						
						
						
					}
					
		
				}
			});
			springLayout.putConstraint(SpringLayout.NORTH, btnBlue, 129, SpringLayout.NORTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, btnBlue, 10, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, btnBlue, 0, SpringLayout.EAST, Monkey);
			frame.getContentPane().add(btnBlue);
			
			btnRed = new JButton("Red");
			springLayout.putConstraint(SpringLayout.WEST, btnRed, 10, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, btnRed, -447, SpringLayout.SOUTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, btnRed, -64, SpringLayout.WEST, CarBtn);
			btnRed.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
	
					
					if(Variables.RacesWon >= 15000 && BodykitPrice != 4000){
					
						Variables.RacesWon -= 15000;
						

						int w = Math.max(OriginalImage.getWidth(), Red.getWidth());
						int h = Math.max(OriginalImage.getHeight(), Red.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage(Red, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("no writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						
				
						
						
						
					}
					
		
				}
			});
			
			
			
			frame.getContentPane().add(btnRed);
			
			btnPurple = new JButton("Purple");
			springLayout.putConstraint(SpringLayout.NORTH, btnPurple, 26, SpringLayout.SOUTH, btnRed);
			springLayout.putConstraint(SpringLayout.WEST, btnPurple, 10, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, btnPurple, -64, SpringLayout.WEST, CarBtn);
			btnPurple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
	
					
					if(Variables.RacesWon >= 15000 && BodykitPrice != 4000){
					
						Variables.RacesWon -= 15000;
						

						int w = Math.max(OriginalImage.getWidth(), Purple.getWidth());
						int h = Math.max(OriginalImage.getHeight(), Purple.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage(Purple, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("no writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						
				
						
						
						
					}
					
		
				}
			});
			
			
			frame.getContentPane().add(btnPurple);
			
			btnGray = new JButton("Gray");
			springLayout.putConstraint(SpringLayout.NORTH, btnGray, 28, SpringLayout.SOUTH, btnPurple);
			springLayout.putConstraint(SpringLayout.WEST, btnGray, 10, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, btnGray, -64, SpringLayout.WEST, CarBtn);
			btnGray.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
	
					
					if(Variables.RacesWon >= 15000 && BodykitPrice != 4000){
					
						Variables.RacesWon -= 15000;
						

						int w = Math.max(OriginalImage.getWidth(), Gray.getWidth());
						int h = Math.max(OriginalImage.getHeight(), Gray.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage(Gray, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("no writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						
				
						
						
						
					}
					
		
				}
			});
			
			
			frame.getContentPane().add(btnGray);
			
			btnGreen = new JButton("Green");
			springLayout.putConstraint(SpringLayout.WEST, btnGreen, 10, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, btnGreen, -24, SpringLayout.NORTH, btnRed);
			springLayout.putConstraint(SpringLayout.EAST, btnGreen, -64, SpringLayout.WEST, CarBtn);
			btnGreen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
	
					
					if(Variables.RacesWon >= 15000 && BodykitPrice != 4000){
					
						Variables.RacesWon -= 15000;
						

						int w = Math.max(OriginalImage.getWidth(), Green.getWidth());
						int h = Math.max(OriginalImage.getHeight(), Green.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage(Green, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("no writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						
				
						
						
						
					}
					
		
				}
			});
			
			
			
			frame.getContentPane().add(btnGreen);
			
			JButton btnLeopard = new JButton("Leopard");
			springLayout.putConstraint(SpringLayout.EAST, btnLeopard, -12, SpringLayout.EAST, frame.getContentPane());
			btnLeopard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
	
					
					if(Variables.RacesWon >= 50000 && BodykitPrice != 4000){
					
						Variables.RacesWon -= 50000;
						

						int w = Math.max(OriginalImage.getWidth(), Leopard.getWidth());
						int h = Math.max(OriginalImage.getHeight(),  Leopard.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage( Leopard, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("no writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						
				
						
						
						
					}
					
		
				}
			});
			
			
			
			frame.getContentPane().add(btnLeopard);
			
			JButton btnRainbow = new JButton("Rainbow");
			springLayout.putConstraint(SpringLayout.NORTH, btnRainbow, 60, SpringLayout.SOUTH, btnLeopard);
			btnRainbow.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
	
					
					if(Variables.RacesWon >= 50000 && BodykitPrice != 4000){
					
						Variables.RacesWon -= 50000;
						

						int w = Math.max(OriginalImage.getWidth(), Rainbow.getWidth());
						int h = Math.max(OriginalImage.getHeight(), Rainbow.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage(Rainbow, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("no writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						
				
						
						
						
					}
					
		
				}
			});
			
			
			
			
			frame.getContentPane().add(btnRainbow);
			
			JButton btn420 = new JButton("420");
			springLayout.putConstraint(SpringLayout.NORTH, btn420, 63, SpringLayout.SOUTH, btnRainbow);
			springLayout.putConstraint(SpringLayout.WEST, btn420, 24, SpringLayout.EAST, CarBtn);
			springLayout.putConstraint(SpringLayout.EAST, btn420, -10, SpringLayout.EAST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, btnRainbow, 0, SpringLayout.EAST, btn420);
			btn420.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
	
					
					if(Variables.RacesWon >= 50000 && BodykitPrice != 4000){
						
						
						JOptionPane.showMessageDialog(null, "Achievement: They are actually maple leaves...or maybe palm trees");
						Achievements.Achievements.add("Achievement: They are actually maple leaves...or maybe palm trees");

						
					
						Variables.RacesWon -= 50000;
						

						int w = Math.max(OriginalImage.getWidth(), FourTwenty.getWidth());
						int h = Math.max(OriginalImage.getHeight(), FourTwenty.getHeight());
						BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
						
						
						
						
						Graphics g = combined.getGraphics();
						g.drawImage(OriginalImage, 0, 0, null);
						g.drawImage(FourTwenty, 0, 0, null);
						
						
						
						
						try {
							//ImageIO.write(combined, "PNG", new File(path, "combined.png"));
							ImageIO.write(combined, "PNG", outputfile);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							System.out.println("no writing occured");
							e.printStackTrace();
						}
						
						try {
							newcombo = ImageIO.read(combinor);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					CarBtn.setIcon(new ImageIcon(newcombo));
						
						OriginalImage = newcombo;
						
				
						
						
						
					}
					
		
				}
			});
			
			
			
			frame.getContentPane().add(btn420);
			
			RacesWonCount = new JLabel("0");
			springLayout.putConstraint(SpringLayout.NORTH, RacesWonCount, -1, SpringLayout.NORTH, lblRacesWon);
			springLayout.putConstraint(SpringLayout.EAST, RacesWonCount, -265, SpringLayout.EAST, frame.getContentPane());
			RacesWonCount.setFont(new Font("Platinum Beat BTN", Font.BOLD, 31));
			frame.getContentPane().add(RacesWonCount);
			
			
			
			
			
			//all the fucking labels
			
			MonkeyCost = new JLabel("Cost: " + MonkeyPrice);
			springLayout.putConstraint(SpringLayout.NORTH, MonkeyCost, 6, SpringLayout.SOUTH, Monkey);
			springLayout.putConstraint(SpringLayout.WEST, MonkeyCost, 10, SpringLayout.WEST, frame.getContentPane());
			frame.getContentPane().add(MonkeyCost);
			
			MonekeysOwned = new JLabel("Owned: " + MonkeyAmount);
			springLayout.putConstraint(SpringLayout.WEST, MonekeysOwned, 10, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, btnEngine, 0, SpringLayout.SOUTH, MonekeysOwned);
			springLayout.putConstraint(SpringLayout.NORTH, SoccerMom, 6, SpringLayout.SOUTH, MonekeysOwned);
			springLayout.putConstraint(SpringLayout.NORTH, MonekeysOwned, 6, SpringLayout.SOUTH, MonkeyCost);
			frame.getContentPane().add(MonekeysOwned);
			
			SoccerMomCost = new JLabel("Cost: " + SoccerMomPrice);
			springLayout.putConstraint(SpringLayout.NORTH, SoccerMomCost, 6, SpringLayout.SOUTH, SoccerMom);
			springLayout.putConstraint(SpringLayout.WEST, SoccerMomCost, 10, SpringLayout.WEST, frame.getContentPane());
			frame.getContentPane().add(SoccerMomCost);
			
			SoccerMomsOwned = new JLabel("Owned: " + SoccerMomAmount);
			springLayout.putConstraint(SpringLayout.WEST, SoccerMomsOwned, 10, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.NORTH, Racer, 6, SpringLayout.SOUTH, SoccerMomsOwned);
			springLayout.putConstraint(SpringLayout.NORTH, SoccerMomsOwned, 9, SpringLayout.SOUTH, SoccerMomCost);
			frame.getContentPane().add(SoccerMomsOwned);
			
			RacerCost = new JLabel("Cost: " + RacerPrice);
			springLayout.putConstraint(SpringLayout.WEST, RacerCost, 10, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, btnWheels, 0, SpringLayout.SOUTH, RacerCost);
			springLayout.putConstraint(SpringLayout.NORTH, RacerCost, 6, SpringLayout.SOUTH, Racer);
			frame.getContentPane().add(RacerCost);
			
			RacersOwned = new JLabel("Owned: " + RacerAmount );
			springLayout.putConstraint(SpringLayout.NORTH, RacersOwned, 6, SpringLayout.SOUTH, RacerCost);
			springLayout.putConstraint(SpringLayout.WEST, RacersOwned, 10, SpringLayout.WEST, frame.getContentPane());
			frame.getContentPane().add(RacersOwned);
			
			EngineCost = new JLabel("Cost: " + EnginePrice);
			springLayout.putConstraint(SpringLayout.NORTH, EngineCost, 0, SpringLayout.NORTH, SoccerMom);
			springLayout.putConstraint(SpringLayout.WEST, EngineCost, 0, SpringLayout.WEST, lblUpgrades);
			frame.getContentPane().add(EngineCost);
			
			EnginesOwned = new JLabel("Owned: " + EnginesUpg);
			springLayout.putConstraint(SpringLayout.NORTH, EnginesOwned, 6, SpringLayout.SOUTH, EngineCost);
			springLayout.putConstraint(SpringLayout.WEST, EnginesOwned, 0, SpringLayout.WEST, lblUpgrades);
			frame.getContentPane().add(EnginesOwned);
			
			WheelCost = new JLabel("Cost: " + WheelPrice);
			springLayout.putConstraint(SpringLayout.WEST, WheelCost, 0, SpringLayout.WEST, lblUpgrades);
			springLayout.putConstraint(SpringLayout.SOUTH, WheelCost, 0, SpringLayout.SOUTH, RacersOwned);
			frame.getContentPane().add(WheelCost);
			
			WheelsOwned = new JLabel("Owned: " + WheelsUpg);
			springLayout.putConstraint(SpringLayout.NORTH, WheelsOwned, 6, SpringLayout.SOUTH, WheelCost);
			springLayout.putConstraint(SpringLayout.WEST, WheelsOwned, 0, SpringLayout.WEST, lblUpgrades);
			frame.getContentPane().add(WheelsOwned);
			
			RimsCost = new JLabel("Cost: " + RimsPrice);
			springLayout.putConstraint(SpringLayout.NORTH, RimsCost, 0, SpringLayout.NORTH, SoccerMom);
			springLayout.putConstraint(SpringLayout.WEST, RimsCost, 0, SpringLayout.WEST, btnRims);
			frame.getContentPane().add(RimsCost);
			
			RimsOwned = new JLabel("Owned: " + RimsUpg);
			springLayout.putConstraint(SpringLayout.NORTH, RimsOwned, 0, SpringLayout.NORTH, EnginesOwned);
			springLayout.putConstraint(SpringLayout.WEST, RimsOwned, 0, SpringLayout.WEST, btnRims);
			frame.getContentPane().add(RimsOwned);
			
			NOsCost = new JLabel("Cost: " + NOsPrice);
			springLayout.putConstraint(SpringLayout.WEST, NOsCost, 0, SpringLayout.WEST, btnRims);
			springLayout.putConstraint(SpringLayout.SOUTH, NOsCost, 0, SpringLayout.SOUTH, RacersOwned);
			frame.getContentPane().add(NOsCost);
			
			NOsOwned = new JLabel("Owned: " + NOsUpg);
			springLayout.putConstraint(SpringLayout.WEST, NOsOwned, 0, SpringLayout.WEST, btnRims);
			springLayout.putConstraint(SpringLayout.SOUTH, NOsOwned, 0, SpringLayout.SOUTH, WheelsOwned);
			frame.getContentPane().add(NOsOwned);
			
			VisibilityCost = new JLabel("Cost: " + VisibilityPrice);
			springLayout.putConstraint(SpringLayout.NORTH, VisibilityCost, 0, SpringLayout.NORTH, SoccerMom);
			springLayout.putConstraint(SpringLayout.WEST, VisibilityCost, 0, SpringLayout.WEST, btnVisibility);
			frame.getContentPane().add(VisibilityCost);
			
			VisibilityOwned = new JLabel("Owned: " + VisibilityUpg);
			springLayout.putConstraint(SpringLayout.NORTH, VisibilityOwned, 0, SpringLayout.NORTH, EnginesOwned);
			springLayout.putConstraint(SpringLayout.WEST, VisibilityOwned, 0, SpringLayout.WEST, btnVisibility);
			frame.getContentPane().add(VisibilityOwned);
			
			TintsCost = new JLabel("Cost: " + TintsPrice);
			springLayout.putConstraint(SpringLayout.NORTH, TintsCost, 6, SpringLayout.SOUTH, btnTints);
			springLayout.putConstraint(SpringLayout.WEST, TintsCost, 0, SpringLayout.WEST, btnVisibility);
			frame.getContentPane().add(TintsCost);
			
			TintsOwned = new JLabel("Owned: " + TintsUpg);
			springLayout.putConstraint(SpringLayout.NORTH, TintsOwned, 0, SpringLayout.NORTH, WheelsOwned);
			springLayout.putConstraint(SpringLayout.WEST, TintsOwned, 0, SpringLayout.WEST, btnVisibility);
			frame.getContentPane().add(TintsOwned);
			
			BodykitCost = new JLabel("Cost: " + BodykitPrice);
			springLayout.putConstraint(SpringLayout.NORTH, BodykitCost, 0, SpringLayout.NORTH, SoccerMom);
			springLayout.putConstraint(SpringLayout.WEST, BodykitCost, 0, SpringLayout.WEST, btnBodyKit);
			frame.getContentPane().add(BodykitCost);
			
			BodykitOwned = new JLabel("Owned: " + BodykitUpg);
			springLayout.putConstraint(SpringLayout.EAST, CarBtn, 0, SpringLayout.EAST, BodykitOwned);
			springLayout.putConstraint(SpringLayout.WEST, BodykitOwned, 0, SpringLayout.WEST, btnBodyKit);
			springLayout.putConstraint(SpringLayout.SOUTH, BodykitOwned, 0, SpringLayout.SOUTH, EnginesOwned);
			frame.getContentPane().add(BodykitOwned);
			
			TurboCost = new JLabel("Cost: " + TurbochargerPrice);
			springLayout.putConstraint(SpringLayout.WEST, TurboCost, 0, SpringLayout.WEST, btnBodyKit);
			springLayout.putConstraint(SpringLayout.SOUTH, TurboCost, 0, SpringLayout.SOUTH, RacersOwned);
			frame.getContentPane().add(TurboCost);
			
			TurbosOwned = new JLabel("Owned: " + TurbochargerUpg);
			springLayout.putConstraint(SpringLayout.WEST, TurbosOwned, 0, SpringLayout.WEST, btnBodyKit);
			springLayout.putConstraint(SpringLayout.SOUTH, TurbosOwned, 0, SpringLayout.SOUTH, WheelsOwned);
			frame.getContentPane().add(TurbosOwned);
			
			JLabel lblColors = new JLabel("Colors: Must have BodyKit");
			springLayout.putConstraint(SpringLayout.SOUTH, lblColors, -602, SpringLayout.SOUTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.NORTH, CarBtn, 6, SpringLayout.SOUTH, lblColors);
			springLayout.putConstraint(SpringLayout.WEST, lblColors, 10, SpringLayout.WEST, frame.getContentPane());
			frame.getContentPane().add(lblColors);
			
			JLabel lblCost = new JLabel("Cost: 15000");
			springLayout.putConstraint(SpringLayout.WEST, lblCost, 0, SpringLayout.WEST, lblRacesWon);
			springLayout.putConstraint(SpringLayout.SOUTH, lblCost, -6, SpringLayout.NORTH, btnBlue);
			frame.getContentPane().add(lblCost);
			
			JLabel lblBonusColors = new JLabel("Bonus Colors");
			springLayout.putConstraint(SpringLayout.NORTH, lblBonusColors, 0, SpringLayout.NORTH, lblColors);
			springLayout.putConstraint(SpringLayout.EAST, lblBonusColors, 0, SpringLayout.EAST, btnLeopard);
			frame.getContentPane().add(lblBonusColors);
			
			JLabel lblCost_1 = new JLabel("Cost: 50000");
			springLayout.putConstraint(SpringLayout.NORTH, btnLeopard, 38, SpringLayout.SOUTH, lblCost_1);
			springLayout.putConstraint(SpringLayout.NORTH, lblCost_1, 0, SpringLayout.NORTH, lblCost);
			springLayout.putConstraint(SpringLayout.EAST, lblCost_1, 0, SpringLayout.EAST, btnLeopard);
			frame.getContentPane().add(lblCost_1);
			
			JButton btnAchivements = new JButton("Achievements");
			btnAchivements.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null, Achievements.Achievements);
				}
			});
			springLayout.putConstraint(SpringLayout.NORTH, btnAchivements, 10, SpringLayout.NORTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, btnAchivements, 68, SpringLayout.NORTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, btnAchivements, -115, SpringLayout.EAST, frame.getContentPane());
			frame.getContentPane().add(btnAchivements);
			
			JButton btnHowToPlay = new JButton("How To Play");
			btnHowToPlay.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
                     JOptionPane.showMessageDialog(null, "HOW TO PLAY: Click the car to win races." + '\n'  + "The more Races you win the more you can buy. " + '\n'  + " Upgrades increases the amount of races you win per click, " + '\n'  + "while Drivers do the clicking for you. " + '\n'  + "Colors decorate your car " + '\n'  + "Now go out there and make a clean street racer!" + '\n'  + "NOTE: difficulty is on easy, if you want it hard talk to me personally"); 
					
				}
			});
			springLayout.putConstraint(SpringLayout.NORTH, btnHowToPlay, 10, SpringLayout.NORTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.WEST, btnHowToPlay, 0, SpringLayout.EAST, btnAchivements);
			springLayout.putConstraint(SpringLayout.SOUTH, btnHowToPlay, 68, SpringLayout.NORTH, frame.getContentPane());
			frame.getContentPane().add(btnHowToPlay);
			
			btnChampionshipRace = new JButton("Championship Race - CLICK HERE");
			btnChampionshipRace.setVisible(false);
			btnChampionshipRace.setEnabled(false);
			btnChampionshipRace.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					JOptionPane.showMessageDialog(null, "You won a championship race!! BONUS: "  + Variables.RacesWon/5);
					
					Variables.RacesWon += Variables.RacesWon/5;
					
					
					String momentary = "" + Variables.RacesWon;
					RacesWonCount.setText(momentary);
					btnChampionshipRace.setVisible(false);
					btnChampionshipRace.setEnabled(false);
				}
			});
			springLayout.putConstraint(SpringLayout.WEST, btnChampionshipRace, 192, SpringLayout.EAST, lblColors);
			springLayout.putConstraint(SpringLayout.SOUTH, btnChampionshipRace, -6, SpringLayout.NORTH, CarBtn);
			frame.getContentPane().add(btnChampionshipRace);
			
			ChampionshipRace.start();
			frame.setVisible(true);
			
			
			
		}
	}

