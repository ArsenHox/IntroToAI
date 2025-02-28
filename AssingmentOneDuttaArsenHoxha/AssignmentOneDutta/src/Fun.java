/*From the Deitel and Deitel java textbook*/
import java.util.*;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fun extends JPanel
{
 public static void main( String args[] ) {
	 
	 
	 	
	  int h = 961;
	  int Rec1x[] = {230,  230, 600, 600  }; 
	  int Rec1y[] = {h-131, h-21, h-21, h-131 }; 
	  double Rec1H[] = {0, 0, 0, 0};
	  for( int i = 0; i < Rec1x.length; i++) {
		  Rec1H[i] = Math.sqrt( Math.pow(Rec1x[i] - 997, 2) + Math.pow(Rec1y[i] - ( h -449) ,2 ) );
		  
	  }  
	  int Penta1x[] = {337, 214, 191, 324, 411};
	  int Penta1y[] = {h - 193, h - 219, h - 345, h- 464, h - 344};
	  double Penta1H[] = {0, 0, 0, 0, 0};
	  for( int i = 0; i < Penta1x.length; i++) {
		  Penta1H[i] = Math.sqrt( Math.pow(Penta1x[i] - 997, 2) + Math.pow(Penta1y[i] - ( h -449) ,2 ) );		  
	  }
	  int Tri1x[] = {413, 466, 518};
	  int Tri1y[] = {h - 185, h - 367, h - 185};
	  double Tri1H[] = {0, 0, 0};
	  for( int i = 0; i < Tri1x.length; i++) {
		  Tri1H[i] = Math.sqrt( Math.pow(Tri1x[i] - 997, 2) + Math.pow(Tri1y[i] - ( h -449) ,2 ) );		  
	  }
      int Trapx[] = {524, 526, 615, 680};
	  int Trapy[] = {h - 310, h - 452, h - 464, h - 399};
	  double TrapH[] = {0, 0, 0, 0};
	  for( int i = 0; i < Trapx.length; i++) {
		  TrapH[i] = Math.sqrt( Math.pow(Trapx[i] - 997, 2) + Math.pow(Trapy[i] - ( h -449) ,2 ) );		  
	  }
	  int Tri2x[] = {617, 655, 732};
	  int Tri2y[] = {h - 248, h - 80, h - 152};
	  double Tri2H[] = {0, 0, 0};
	  for( int i = 0; i < Tri2x.length; i++) {
		  Tri2H[i] = Math.sqrt( Math.pow(Tri2x[i] - 997, 2) + Math.pow(Tri2y[i] - ( h -449) ,2 ) );		  
	  }
	  int Rec2x[] = {703, 703, 856, 856};
	  int Rec2y[] = {h - 213,h -  451, h - 451, h - 213};
	  double Rec2H[] = {0, 0, 0, 0};
	  for( int i = 0; i < Rec2x.length; i++) {
		  Rec2H[i] = Math.sqrt( Math.pow(Rec2x[i] - 997, 2) + Math.pow(Rec2y[i] - ( h -449) ,2 ) );		  
	  }
	  int Hexx[] = {792, 792, 863, 938, 938, 876};
	  int Hexy[] = {h - 143, h - 55, h - 15,h -  55, h - 143, h - 195};
	  double HexH[] = {0, 0, 0, 0, 0, 0};
	  for( int i = 0; i < Hexx.length; i++) {
		  HexH[i] = Math.sqrt( Math.pow(Hexx[i] - 997, 2) + Math.pow(Hexy[i] - ( h -449) ,2 ) );		 
	  }
	  int Polyx[] = {954, 879, 930, 975};
	  int Polyy[] = {h - 181,h - 420, h - 455, h - 410};
	  double PolyH[] = {0, 0, 0, 0};
	  for( int i = 0; i < Polyx.length; i++) {
		  PolyH[i] = Math.sqrt( Math.pow(Polyx[i] - 997, 2) + Math.pow(Polyy[i] - ( h -449) ,2 ) );		  
	  }
	  double Line = Math.sqrt( Math.pow(199 - 997, 2) + Math.pow( (h - 71) - ( h -449) ,2 ) );

	  //start is 199, h - 71
	  //goal is 997,h - 449
	 Node head = new Node(Line, "head", 199, h- 71);
	 head.traveled = 0;
	 
	 Node target = new Node(0, "target", 997, h - 449);
	 
	 Node Rec1TL = new Node(Rec1H[0], "Rec1TL", 230, h -131);	 
	 Node Rec1BL = new Node( Rec1H[1], "Rec1BL", 230, h - 21);	 
	 Node Rec1BR = new Node ( Rec1H[2], "Rec1BR", 600, h-21 );	 
	 Node Rec1TR = new Node ( Rec1H[3], "Rec1TR", 600, h - 131);
	 
	 Node Penta1BL = new Node (Penta1H[1], "Penta1BL", 214, h - 219 );
	 Node Penta1ML = new Node ( Penta1H[2], "Penta1ML", 191, h - 345);
	 Node Penta1BR = new Node ( Penta1H[0], "Penta1BR", 337, h - 193);
	 Node Penta1MR = new Node ( Penta1H[4], "Penta1MR", 411, h - 344);
	 Node Penta1T = new Node ( Penta1H[3], "Penta1T", 324, h - 464);
	 
	 Node Tri1BL = new Node ( Tri1H[0], "Tri1BL", 413, h - 185 ); 
	 Node Tri1T = new Node ( Tri1H[1] , "Tri1T", 466, h - 367 );
	 Node Tri1BR = new Node (Tri1H[2], "Tri1BR", 518, h - 185);
	 
	 Node TrapBL = new Node ( TrapH[0], "TrapBL", 524, h - 310 );
	 Node TrapTL = new Node ( TrapH[1], "TrapTL", 526, h - 452);
	 Node TrapTR = new Node ( TrapH[2], "TrapTR", 615, h - 464);
	 Node TrapBR = new Node ( TrapH[3], "TrapBR", 680, h - 399);
	 
	 Node Tri2T = new Node (Tri2H[0], "Tri2T", 617, h - 248 );
	 Node Tri2BL = new Node (Tri2H[1], "Tri2BL", 655, h - 80);
	 Node Tri2BR = new Node (Tri2H[2], "Tri2BR", 732, h - 152);
	 
	 Node Rec2BL = new Node( Rec2H[0], "Rec2BL", 703, h - 213);
	 Node Rec2TL = new Node( Rec2H[1], "Rec2TL", 703, h - 451); 
	 Node Rec2TR = new Node( Rec2H[2], "Rec2TR", 856, h - 451);
	 Node Rec2BR = new Node( Rec2H[3], "Rec2BR", 856, h - 213);
	 
	 Node HexTL = new Node (HexH[0], "HexTL", 792, h - 143);
	 Node HexBL = new Node (HexH[1], "HexBL", 792, h - 55);
	 Node HexB = new Node (HexH[2], "HexB", 863, h - 15);
	 Node HexBR = new Node (HexH[3] , "HexBR", 938, h - 55);
	 Node HexTR = new Node (HexH[4] , "HexTR", 938, h - 143);
	 Node HexT = new Node (HexH[5], "HexT", 876, h - 195);
	 
	 Node PolyB = new Node( PolyH[0], "PolyB", 954, h - 181);
	 Node PolyTL = new Node( PolyH[1] , "PolyTL", 879, h - 420);
	 Node PolyT = new Node( PolyH[2] , "PolyT", 930, h- 455);
	 Node PolyTR = new Node( PolyH[3], "PolyTR", 975, h - 410);
	 
	 
	 Double StartNode[] = {
		Math.sqrt( Math.pow(199 - Rec1x[1], 2) + Math.pow( (h - 71) - ( Rec1y[1]) ,2 ) ),	 
		Math.sqrt( Math.pow(199 - Rec1x[0], 2) + Math.pow( (h - 71) - ( Rec1y[0]) ,2 ) ),	 
		Math.sqrt( Math.pow(199 - Penta1x[1], 2) + Math.pow( (h - 71) - ( Penta1y[1]) ,2 ) ),
		Math.sqrt( Math.pow(199 - Penta1x[2], 2) + Math.pow( (h - 71) - ( Penta1y[2]) ,2 ) ),
	 };
	 //start node edges
	 head.addBranch(StartNode[0], Rec1BL );
	 head.addBranch(StartNode[1], Rec1TL);
	 head.addBranch(StartNode[2], Penta1BL); 
	 head.addBranch(StartNode[3], Penta1ML); 
	 //rec1
	 Double R1TR[] = {
			 Math.sqrt( Math.pow(Rec1x[3] - Rec1x[0], 2) + Math.pow( Rec1y[3] - ( Rec1y[0]) ,2 ) ), // TL
			 Math.sqrt( Math.pow(Rec1x[3] - Rec1x[2], 2) + Math.pow( Rec1y[3] - ( Rec1y[2]) ,2 ) ), // BR
			 Math.sqrt( Math.pow(Rec1x[3] - Tri2x[1], 2) + Math.pow( Rec1y[3] - ( Tri2y[1]) ,2 ) ), // T2BL
			 Math.sqrt( Math.pow(Rec1x[3] - Tri2x[0], 2) + Math.pow( Rec1y[3] - ( Tri2y[0]) ,2 ) ), //T2T
			 Math.sqrt( Math.pow(Rec1x[3] - Tri1x[2], 2) + Math.pow( Rec1y[3] - ( Tri1y[2]) ,2 ) ), // T1BR
			 Math.sqrt( Math.pow(Rec1x[3] - Tri1x[0], 2) + Math.pow( Rec1y[3] - ( Tri1y[0]) ,2 ) ), //T1BL
			 Math.sqrt( Math.pow(Rec1x[3] - Tri1x[1], 2) + Math.pow( Rec1y[3] - ( Tri1y[1]) ,2 ) ), //T1T
			 Math.sqrt( Math.pow(Rec1x[3] - Trapx[0], 2) + Math.pow( Rec1y[3] - ( Trapy[0]) ,2 ) ), //TBL
			 Math.sqrt( Math.pow(Rec1x[3] - Penta1x[0], 2) + Math.pow( Rec1y[3] - ( Penta1y[0]) ,2 ) ), // P1BR			 
	 };
	 Rec1TR.addBranch(R1TR[0], Rec1TL);	 
	 Rec1TR.addBranch(R1TR[1], Rec1BR);
	 Rec1TR.addBranch(R1TR[2], Tri2BL);
	 Rec1TR.addBranch(R1TR[3], Tri2T);
	 Rec1TR.addBranch(R1TR[4], Tri2BR);
	 Rec1TR.addBranch(R1TR[5], Rec1TL);
	 Rec1TR.addBranch(R1TR[6], TrapBL);
	 Rec1TR.addBranch(R1TR[7], Penta1BR);
	 
	 Double R1TL[] = {
			 Math.sqrt( Math.pow(Rec1x[0] - Rec1x[1], 2) + Math.pow( Rec1y[0] - ( Rec1y[1]) ,2 ) ), //R1BL
			 Math.sqrt( Math.pow(Rec1x[0] - Rec1x[3], 2) + Math.pow( Rec1y[0] - ( Rec1y[3]) ,2 ) ), //R1TR
			 Math.sqrt( Math.pow(Rec1x[0] - Penta1x[1], 2) + Math.pow( Rec1y[0] - ( Penta1y[1]) ,2 ) ), //P1BL
			 Math.sqrt( Math.pow(Rec1x[0] - Penta1x[0], 2) + Math.pow( Rec1y[0] - ( Penta1y[0]) ,2 ) ), //P1BR
			 Math.sqrt( Math.pow(Rec1x[0] - Tri1x[0], 2) + Math.pow( Rec1y[0] - ( Tri1y[0]) ,2 ) ), //T1BL
			 Math.sqrt( Math.pow(Rec1x[0] - Tri1x[2], 2) + Math.pow( Rec1y[0] - ( Tri1y[2]) ,2 ) ), //T1BR
	 };
	 Rec1TL.addBranch(R1TL[0], Rec1BL);
	 Rec1TL.addBranch(R1TL[1], Rec1TR);
	 Rec1TL.addBranch(R1TL[2], Penta1BL);
	 Rec1TL.addBranch(R1TL[3], Penta1BR);
	 Rec1TL.addBranch(R1TL[4], Tri1BL);
	 Rec1TL.addBranch(R1TL[5], Tri1BR);
	 
	 Double R1BL[] = {
			 Math.sqrt( Math.pow(Rec1x[1] - Rec1x[0], 2) + Math.pow( Rec1y[1] - ( Rec1y[0]) ,2 ) ), //R1TL
			 Math.sqrt( Math.pow(Rec1x[1] - Rec1x[2], 2) + Math.pow( Rec1y[1] - ( Rec1y[2]) ,2 ) ), //R1BR
			 Math.sqrt( Math.pow(Rec1x[1] - 199, 2) + Math.pow( Rec1y[1] - ( h - 71) ,2 ) ), // start
			 Math.sqrt( Math.pow(Rec1x[1] - Penta1x[1], 2) + Math.pow( Rec1y[1] - ( Penta1y[1]) ,2 ) ), //P1BL
			 Math.sqrt( Math.pow(Rec1x[1] - Penta1x[2], 2) + Math.pow( Rec1y[1] - ( Penta1y[2]) ,2 ) ), //P1ML
	 };
	 Rec1BL.addBranch(R1BL[0], Rec1TL);
	 Rec1BL.addBranch(R1BL[1], Rec1BR);
	 Rec1BL.addBranch(R1BL[2], head );
	 Rec1BL.addBranch(R1BL[3], Penta1BL);
	 Rec1BL.addBranch(R1BL[4], Penta1ML);
	 Double R1BR[] = {
			 Math.sqrt( Math.pow(Rec1x[2] - Rec1x[1], 2) + Math.pow( Rec1y[2] - ( Rec1y[1]) ,2 ) ), //R1BL
			 Math.sqrt( Math.pow(Rec1x[2] - Rec1x[3], 2) + Math.pow( Rec1y[2] - ( Rec1y[3]) ,2 ) ), //R1TR
			 Math.sqrt( Math.pow(Rec1x[2] - Tri2x[0], 2) + Math.pow( Rec1y[2] - ( Tri2y[0]) ,2 ) ), //T2T
			 Math.sqrt( Math.pow(Rec1x[2] - Tri2x[1], 2) + Math.pow( Rec1y[2] - ( Tri2y[1]) ,2 ) ), //T2BL
			 Math.sqrt( Math.pow(Rec1x[2] - Hexx[0], 2) + Math.pow( Rec1y[2] - ( Hexy[0]) ,2 ) ), //HTL
			 Math.sqrt( Math.pow(Rec1x[2] - Hexx[1], 2) + Math.pow( Rec1y[2] - ( Hexy[1]) ,2 ) ), //HBL
			 Math.sqrt( Math.pow(Rec1x[2] - Hexx[2], 2) + Math.pow( Rec1y[2] - ( Hexy[2]) ,2 ) ), //HB
			 Math.sqrt( Math.pow(Rec1x[2] - Rec2x[3], 2) + Math.pow( Rec1y[2] - ( Rec2y[3]) ,2 ) ), //R2BR
	 };
	 Rec1BR.addBranch(R1BR[0], Rec1BL);
	 Rec1BR.addBranch(R1BR[1], Rec1TR);
	 Rec1BR.addBranch(R1BR[2], Tri2T);
	 Rec1BR.addBranch(R1BR[3], Tri2BL);
	 Rec1BR.addBranch(R1BR[4], HexT);
	 Rec1BR.addBranch(R1BR[5], HexBL);
	 Rec1BR.addBranch(R1BR[6], HexB);
	 Rec1BR.addBranch(R1BR[7], Rec2BR);
	 //Penta1
	 Double P1BL[] = {
			 Math.sqrt( Math.pow(Penta1BL.x - Penta1ML.x, 2) + Math.pow(Penta1BL.y - ( Penta1ML.y) ,2 ) ), // P1ML
			 Math.sqrt( Math.pow(Penta1BL.x - Penta1BR.x, 2) + Math.pow(Penta1BL.y - ( Penta1BR.y) ,2 ) ), //P1BR
			 Math.sqrt( Math.pow(Penta1BL.x - head.x, 2) + Math.pow(Penta1BL.y - ( head.y) ,2 ) ), //head
			 Math.sqrt( Math.pow(Penta1BL.x - Rec1TL.x, 2) + Math.pow(Penta1BL.y - ( Rec1TL.y) ,2 ) ), //R1TL			 
	 };
	 Penta1BL.addBranch(P1BL[0], Penta1ML );
	 Penta1BL.addBranch(P1BL[1], Penta1BR);
	 Penta1BL.addBranch(P1BL[2], head);
	 Penta1BL.addBranch(P1BL[3], Rec1TL);
	 
	 Double P1ML[] = {
			 Math.sqrt( Math.pow(Penta1ML.x - Penta1T.x, 2) + Math.pow(Penta1ML.y - ( Penta1T.y) ,2 ) ), // P1T
			 Math.sqrt( Math.pow(Penta1ML.x - Penta1BL.x, 2) + Math.pow(Penta1ML.y - ( Penta1BL.y) ,2 ) ), //P1BL
			 Math.sqrt( Math.pow(Penta1ML.x - head.x, 2) + Math.pow(Penta1ML.y - ( head.y) ,2 ) ), //head
			 Math.sqrt( Math.pow(Penta1ML.x - Rec1BL.x, 2) + Math.pow(Penta1ML.y - ( Rec1BL.y) ,2 ) ), //R1BL
	 };
	 Penta1ML.addBranch(P1ML[0], Penta1T);
	 Penta1ML.addBranch(P1ML[1], Penta1BL);
	 Penta1ML.addBranch(P1ML[2], head);
	 Penta1ML.addBranch(P1ML[3], Rec1BL);
	 Double P1T[] = {
			 Math.sqrt( Math.pow(Penta1T.x - Penta1ML.x, 2) + Math.pow(Penta1T.y - ( Penta1ML.y) ,2 ) ), //P1ML
			 Math.sqrt( Math.pow(Penta1T.x - Penta1MR.x, 2) + Math.pow(Penta1T.y - ( Penta1MR.y) ,2 ) ), //P1MR
			 Math.sqrt( Math.pow(Penta1T.x - Tri1T.x, 2) + Math.pow(Penta1T.y - ( Tri1T.y) ,2 ) ), // T1T
			 Math.sqrt( Math.pow(Penta1T.x - TrapTL.x, 2) + Math.pow(Penta1T.y - ( TrapTL.y) ,2 ) ), //TTL
			 Math.sqrt( Math.pow(Penta1T.x - TrapTR.x, 2) + Math.pow(Penta1T.y - ( TrapTR.y) ,2 ) ), // TTR
	 };
	 Penta1T.addBranch(P1T[0], Penta1ML);
	 Penta1T.addBranch(P1T[1], Penta1MR);
	 Penta1T.addBranch(P1T[2], Tri1T);
	 Penta1T.addBranch(P1T[3], TrapTL);
	 Penta1T.addBranch(P1T[4], TrapTR);
	 Double P1MR[] = {
			 Math.sqrt( Math.pow(Penta1MR.x - Penta1T.x, 2) + Math.pow(Penta1MR.y - ( Penta1T.y) ,2 ) ), //P1T
			 Math.sqrt( Math.pow(Penta1MR.x - Penta1BL.x, 2) + Math.pow(Penta1MR.y - ( Penta1BL.y) ,2 ) ), //P1BL
			 Math.sqrt( Math.pow(Penta1MR.x - Tri1T.x, 2) + Math.pow(Penta1MR.y - ( Tri1T.y) ,2 ) ), // T1T
			 Math.sqrt( Math.pow(Penta1MR.x - Tri1BL.x, 2) + Math.pow(Penta1MR.y - ( Tri1BL.y) ,2 ) ), //T1BL
			 Math.sqrt( Math.pow(Penta1MR.x - TrapTL.x, 2) + Math.pow(Penta1MR.y - ( TrapTL.y) ,2 ) ), //TTL
	 };
	 Penta1MR.addBranch(P1MR[0], Penta1T);
	 Penta1MR.addBranch(P1MR[1], Penta1BL);
	 Penta1MR.addBranch(P1MR[2], Tri1T);
	 Penta1MR.addBranch(P1MR[3], Tri1BL);
	 Penta1MR.addBranch(P1MR[4], TrapTL);
	 Double P1BR[] = {
			 Math.sqrt( Math.pow(Penta1BR.x - Penta1BL.x, 2) + Math.pow(Penta1BR.y - ( Penta1BL.y) ,2 ) ), //P1BL
			 Math.sqrt( Math.pow(Penta1BR.x - Penta1MR.x, 2) + Math.pow(Penta1BR.y - ( Penta1MR.y) ,2 ) ), // P1MR
			 Math.sqrt( Math.pow(Penta1BR.x - Tri1T.x, 2) + Math.pow(Penta1BR.y - ( Tri1T.y) ,2 ) ), // T1t
			 Math.sqrt( Math.pow(Penta1BR.x - Tri1BL.x, 2) + Math.pow(Penta1BR.y - ( Tri1BL.y) ,2 ) ), //T1BL
			 Math.sqrt( Math.pow(Penta1BR.x - Rec1TL.x, 2) + Math.pow(Penta1BR.y - ( Rec1TL.y) ,2 ) ), //R1TL
			 Math.sqrt( Math.pow(Penta1BR.x - Rec1TR.x, 2) + Math.pow(Penta1BR.y - ( Rec1TR.y) ,2 ) ), //R1TR
	 };
	 Penta1BR.addBranch(P1BR[0], Penta1BL );
	 Penta1BR.addBranch(P1BR[1], Penta1MR);
	 Penta1BR.addBranch(P1BR[2], Tri1T);
	 Penta1BR.addBranch(P1BR[3], Tri1BL);
	 Penta1BR.addBranch(P1BR[4], Rec1TL);
	 Penta1BR.addBranch(P1BR[5], Rec1TR);
	 //Tri1
	 Double T1T[] = {
			 Math.sqrt( Math.pow(Tri1T.x - Tri1BR.x, 2) + Math.pow( Tri1T.y - ( Tri1BR.y ) ,2 ) ), // T1BR
			 Math.sqrt( Math.pow(Tri1T.x - Tri1BL.x, 2) + Math.pow( Tri1T.y - ( Tri1BL.y) ,2 ) ), //T1BL
			 Math.sqrt( Math.pow(Tri1T.x - Penta1BR.x, 2) + Math.pow( Tri1T.y - ( Penta1BR.y) ,2 ) ), //P1BR
			 Math.sqrt( Math.pow(Tri1T.x - Penta1MR.x, 2) + Math.pow( Tri1T.y - ( Penta1MR.y) ,2 ) ), //P1MR
			 Math.sqrt( Math.pow(Tri1T.x - Penta1T.x, 2) + Math.pow( Tri1T.y - ( Penta1T.y) ,2 ) ), //P1T
			 Math.sqrt( Math.pow(Tri1T.x - TrapTL.x, 2) + Math.pow( Tri1T.y - ( TrapTL.y) ,2 ) ), //TTL
			 Math.sqrt( Math.pow(Tri1T.x - TrapBL.x, 2) + Math.pow( Tri1T.y - ( TrapBL.y) ,2 ) ), //TBL
			 Math.sqrt( Math.pow(Tri1T.x - Rec1TR.x, 2) + Math.pow( Tri1T.y - ( Rec1TR.y) ,2 ) ), //R1TR
			 Math.sqrt( Math.pow(Tri1T.x - Tri2BL.x, 2) + Math.pow( Tri1T.y - ( Tri2BL.y) ,2 ) ), //T2BL
	 };
	 Tri1T.addBranch(T1T[0], Tri1BR);
	 Tri1T.addBranch(T1T[1], Tri1BL);
	 Tri1T.addBranch(T1T[2], Penta1BR);
	 Tri1T.addBranch(T1T[3], Penta1MR);
	 Tri1T.addBranch(T1T[4], Penta1T);
	 Tri1T.addBranch(T1T[5], TrapTL);
	 Tri1T.addBranch(T1T[6], TrapBL);
	 Tri1T.addBranch(T1T[7], Rec1TR);
	 Tri1T.addBranch(T1T[8], Tri2BL);
	 Double T1BL[] = {
			 Math.sqrt( Math.pow(Tri1BL.x - Tri1T.x, 2) + Math.pow( Tri1BL.y - ( Tri1T.y ) ,2 ) ), //T1T
			 Math.sqrt( Math.pow(Tri1BL.x - Tri1BR.x, 2) + Math.pow( Tri1BL.y - ( Tri1BR.y ) ,2 ) ), //T1BR
			 Math.sqrt( Math.pow(Tri1BL.x - Penta1MR.x, 2) + Math.pow( Tri1BL.y - ( Penta1MR.y ) ,2 ) ), //P1MR
			 Math.sqrt( Math.pow(Tri1BL.x - Penta1BR.x, 2) + Math.pow( Tri1BL.y - ( Penta1BR.y ) ,2 ) ), //P1BR
			 Math.sqrt( Math.pow(Tri1BL.x - Rec1TL.x, 2) + Math.pow( Tri1BL.y - ( Rec1TL.y ) ,2 ) ), //R1TL
			 Math.sqrt( Math.pow(Tri1BL.x - Rec1TR.x, 2) + Math.pow( Tri1BL.y - ( Rec1TR.y ) ,2 ) ), //R1TR
	 };
	 Tri1BL.addBranch(T1BL[0], Tri1T);
	 Tri1BL.addBranch(T1BL[1], Tri1BR);
	 Tri1BL.addBranch(T1BL[2], Penta1MR);
	 Tri1BL.addBranch(T1BL[3], Penta1BR);
	 Tri1BL.addBranch(T1BL[4], Rec1TL);
	 Tri1BL.addBranch(T1BL[5], Rec1TR);
	 Double T1BR[] = {
			 Math.sqrt( Math.pow(Tri1x[2] - Tri1x[1], 2) + Math.pow( Tri1y[2] - ( Tri1y[1]) ,2 ) ), //T1T
			 Math.sqrt( Math.pow(Tri1x[2] - Tri1x[0], 2) + Math.pow( Tri1y[2] - ( Tri1y[0]) ,2 ) ), //T1BL
			 Math.sqrt( Math.pow(Tri1x[2] - Rec1x[3], 2) + Math.pow( Tri1y[2] - ( Rec1y[3]) ,2 ) ), //R1TR
			 Math.sqrt( Math.pow(Tri1x[2] - Rec1x[0], 2) + Math.pow( Tri1y[2] - ( Rec1y[0]) ,2 ) ), //R1TL
			 Math.sqrt( Math.pow(Tri1x[2] - Tri2x[0], 2) + Math.pow( Tri1y[2] - ( Tri2y[0]) ,2 ) ), //T2T
			 Math.sqrt( Math.pow(Tri1x[2] - Tri2x[1], 2) + Math.pow( Tri1y[2] - ( Tri2y[1]) ,2 ) ), //T2BL
			 Math.sqrt( Math.pow(Tri1x[2] - Trapx[0], 2) + Math.pow( Tri1y[2] - ( Trapy[0]) ,2 ) ), //TBL
			 Math.sqrt( Math.pow(Tri1x[2] - Trapx[3], 2) + Math.pow( Tri1y[2] - ( Trapy[3]) ,2 ) ), //TBR	 
	 };
	 Tri1BR.addBranch(T1BR[0], Tri1T);
	 Tri1BR.addBranch(T1BR[1], Tri1BL);
	 Tri1BR.addBranch(T1BR[2], Rec1TR);
	 Tri1BR.addBranch(T1BR[3], Rec1TL);
	 Tri1BR.addBranch(T1BR[4], Tri2T);
	 Tri1BR.addBranch(T1BR[5], Tri2BL);
	 Tri1BR.addBranch(T1BR[6], TrapBL);
	 Tri1BR.addBranch(T1BR[7], TrapBR);
	 //trap
	 Double TTL[] = {
			 Math.sqrt( Math.pow(TrapTL.x - TrapBL.x, 2) + Math.pow( TrapTL.y - ( TrapBL.y ) ,2 ) ), //TBL
			 Math.sqrt( Math.pow(TrapTL.x - TrapTR.x, 2) + Math.pow( TrapTL.y - ( TrapTR.y ) ,2 ) ), //TTR
			 Math.sqrt( Math.pow(TrapTL.x - Tri1T.x, 2) + Math.pow( TrapTL.y - ( Tri1T.y ) ,2 ) ), //T1T
			 Math.sqrt( Math.pow(TrapTL.x - Penta1T.x, 2) + Math.pow(TrapTL.y - ( Penta1T.y ) ,2 ) ), //P1T
			 Math.sqrt( Math.pow(TrapTL.x - Penta1MR.x, 2) + Math.pow( TrapTL.y - ( Penta1MR.y ) ,2 ) ), //P1MR
	 };
	 TrapTL.addBranch(TTL[0], TrapBL);
	 TrapTL.addBranch(TTL[1], TrapTR);
	 TrapTL.addBranch(TTL[2], Tri1T);
	 TrapTL.addBranch(TTL[3], Penta1T);
	 TrapTL.addBranch(TTL[4], Penta1MR);
	 Double TTR[] = {
			 Math.sqrt( Math.pow(TrapTR.x - TrapTL.x, 2) + Math.pow( TrapTR.y - ( TrapTL.y ) ,2 ) ), //TTL
			 Math.sqrt( Math.pow(TrapTR.x - TrapBR.x, 2) + Math.pow( TrapTR.y - ( TrapBR.y ) ,2 ) ), //TBR
			 Math.sqrt( Math.pow(TrapTR.x - Penta1T.x, 2) + Math.pow( TrapTR.y - ( Penta1T.y ) ,2 ) ), //P1T
			 Math.sqrt( Math.pow(TrapTR.x - Rec2TL.x, 2) + Math.pow( TrapTR.y - ( Rec2TL.y ) ,2 ) ), // R2TL
			 Math.sqrt( Math.pow(TrapTR.x - Rec2TR.x, 2) + Math.pow( TrapTR.y - ( Rec2TR.y ) ,2 ) ), //R2TR
			 Math.sqrt( Math.pow(TrapTR.x - PolyT.x, 2) + Math.pow( TrapTR.y - ( PolyT.y ) ,2 ) ), //PT
			 Math.sqrt( Math.pow(TrapTR.x - target.x, 2) + Math.pow( TrapTR.y - ( target.y ) ,2 ) ), //target
	 };
	 TrapTR.addBranch(TTR[0], TrapTL);
	 TrapTR.addBranch(TTR[1], TrapBR);
	 TrapTR.addBranch(TTR[2], Penta1T);
	 TrapTR.addBranch(TTR[3], Rec2TL);
	 TrapTR.addBranch(TTR[4], Rec2TR);
	 TrapTR.addBranch(TTR[5], PolyT);
	 TrapTR.addBranch(TTR[6], target);
	 Double TBR[] = {
			 Math.sqrt( Math.pow(Trapx[3] - Trapx[0], 2) + Math.pow( Trapy[3] - ( Trapy[0]) ,2 ) ), //TBL
			 Math.sqrt( Math.pow(Trapx[3] - Trapx[2], 2) + Math.pow( Trapy[3] - ( Trapy[2]) ,2 ) ), //TTR
			 Math.sqrt( Math.pow(Trapx[3] - Rec2x[1], 2) + Math.pow( Trapy[3] - ( Rec2y[1]) ,2 ) ), //R2TL
			 Math.sqrt( Math.pow(Trapx[3] - Rec2x[0], 2) + Math.pow( Trapy[3] - ( Rec2y[0]) ,2 ) ), //R2BL
			 Math.sqrt( Math.pow(Trapx[3] - Tri2x[0], 2) + Math.pow( Trapy[3] - ( Tri2y[0]) ,2 ) ), //T2T
			 Math.sqrt( Math.pow(Trapx[3] - Tri1x[2], 2) + Math.pow( Trapy[3] - ( Tri1y[2]) ,2 ) ), //T1BR		 
	 };
	 TrapBR.addBranch(TBR[0], TrapBL );
	 TrapBR.addBranch(TBR[1], TrapTR);
	 TrapBR.addBranch(TBR[2], Rec2TL);
	 TrapBR.addBranch(TBR[3], Rec2BL);
	 TrapBR.addBranch(TBR[4], Tri2T);
	 TrapBR.addBranch(TBR[5], Tri1BR);
	 Double TBL[] = {
			 Math.sqrt( Math.pow(TrapBL.x - TrapTL.x, 2) + Math.pow( TrapBL.y - ( TrapTL.y ) ,2 ) ), //TTL
			 Math.sqrt( Math.pow(TrapBL.x - TrapBR.x, 2) + Math.pow( TrapBL.y - ( TrapBR.y ) ,2 ) ), //TBR
			 Math.sqrt( Math.pow(TrapBL.x - Rec2BL.x, 2) + Math.pow( TrapBL.y - ( Rec2BL.y ) ,2 ) ), //R2BL
			 Math.sqrt( Math.pow(TrapBL.x - Tri2T.x, 2) + Math.pow( TrapBL.y - ( Tri2T.y ) ,2 ) ), //T2T
			 Math.sqrt( Math.pow(TrapBL.x - Tri2BL.x, 2) + Math.pow( TrapBL.y - ( Tri2BL.y ) ,2 ) ), //T2BL
			 Math.sqrt( Math.pow(TrapBL.x - Tri1T.x, 2) + Math.pow( TrapBL.y - ( Tri1T.y ) ,2 ) ), //T1T
			 Math.sqrt( Math.pow(TrapBL.x - Tri1BR.x, 2) + Math.pow( TrapBL.y - ( Tri1BR.y ) ,2 ) ),//T1BR
			 Math.sqrt( Math.pow(TrapBL.x - Rec1TR.x, 2) + Math.pow( TrapBL.y - ( Rec1TR.y ) ,2 ) ), //R1TR
	 };
	 TrapBL.addBranch(TBL[0], TrapTL);
	 TrapBL.addBranch(TBL[1], TrapBR);
	 TrapBL.addBranch(TBL[2], Rec2BL);
	 TrapBL.addBranch(TBL[3], Tri2T);
	 TrapBL.addBranch(TBL[4], Tri2BL);
	 TrapBL.addBranch(TBL[5], Tri1T);
	 TrapBL.addBranch(TBL[6], Tri1BR);
	 TrapBL.addBranch(TBL[7], Rec1TR);
	 	 
	 //Tri2
	 Double T2T[] = {
			 Math.sqrt( Math.pow(Tri2T.x - Tri2BR.x, 2) + Math.pow( Tri2T.y - ( Tri2BR.y ) ,2 ) ), //T2BR
			 Math.sqrt( Math.pow(Tri2T.x - Tri2BL.x, 2) + Math.pow( Tri2T.y - ( Tri2BL.y ) ,2 ) ), // T2BL
			 Math.sqrt( Math.pow(Tri2T.x - Rec1TR.x, 2) + Math.pow( Tri2T.y - ( Rec1TR.y ) ,2 ) ), //R1TR
			 Math.sqrt( Math.pow(Tri2T.x - Rec1BR.x, 2) + Math.pow( Tri2T.y - ( Rec1BR.y ) ,2 ) ), //R1BR
			 Math.sqrt( Math.pow(Tri2T.x - Tri1BR.x, 2) + Math.pow( Tri2T.y - ( Tri1BR.y ) ,2 ) ), //T1BR
			 Math.sqrt( Math.pow(Tri2T.x - TrapBL.x, 2) + Math.pow( Tri2T.y - ( TrapBL.y ) ,2 ) ), //TBL
			 Math.sqrt( Math.pow(Tri2T.x - TrapBR.x, 2) + Math.pow( Tri2T.y - ( TrapBR.y ) ,2 ) ), //TBR
			 Math.sqrt( Math.pow(Tri2T.x - Rec2BL.x, 2) + Math.pow( Tri2T.y - ( Rec2BL.y ) ,2 ) ), //R2BL
			 Math.sqrt( Math.pow(Tri2T.x - Rec2TL.x, 2) + Math.pow( Tri2T.y - ( Rec2TL.y ) ,2 ) ), //R2TL
			 Math.sqrt( Math.pow(Tri2T.x - HexTL.x, 2) + Math.pow( Tri2T.y - ( HexTL.y ) ,2 ) ), //HTL
	 };
	 Tri2T.addBranch(T2T[0], Tri2BR);
	 Tri2T.addBranch(T2T[1], Tri2BL);
	 Tri2T.addBranch(T2T[2], Rec1TR);
	 Tri2T.addBranch(T2T[3], Rec1BR);
	 Tri2T.addBranch(T2T[4], Tri1BR);
	 Tri2T.addBranch(T2T[5], TrapBL);
	 Tri2T.addBranch(T2T[6], TrapBR);
	 Tri2T.addBranch(T2T[7], Rec2BL);
	 Tri2T.addBranch(T2T[8], Rec2TL);
	 Tri2T.addBranch(T2T[9], HexTL);
	 Double T2BL[] = {
			 Math.sqrt( Math.pow(Tri2BL.x - Tri2BR.x, 2) + Math.pow( Tri2BL.y - ( Tri2BR.y ) ,2 ) ), //T2BR
			 Math.sqrt( Math.pow(Tri2BL.x - Tri2T.x, 2) + Math.pow( Tri2BL.y - ( Tri2T.y ) ,2 ) ), //T2T
			 Math.sqrt( Math.pow(Tri2BL.x - Rec1TR.x, 2) + Math.pow( Tri2BL.y - ( Rec1TR.y ) ,2 ) ), //R1TR
			 Math.sqrt( Math.pow(Tri2BL.x - Rec1BR.x, 2) + Math.pow( Tri2BL.y - ( Rec1BR.y ) ,2 ) ), //R1BR
			 Math.sqrt( Math.pow(Tri2BL.x - TrapBL.x, 2) + Math.pow( Tri2BL.y - ( TrapBL.y ) ,2 ) ), //TBL
			 Math.sqrt( Math.pow(Tri2BL.x - Tri1T.x, 2) + Math.pow( Tri2BL.y - ( Tri1T.y ) ,2 ) ), //T1T
			 Math.sqrt( Math.pow(Tri2BL.x - HexBL.x, 2) + Math.pow( Tri2BL.y - ( HexBL.y ) ,2 ) ), //HBL
			 Math.sqrt( Math.pow(Tri2BL.x - HexTL.x, 2) + Math.pow( Tri2BL.y - ( HexTL.y ) ,2 ) ), //HTL
			 Math.sqrt( Math.pow(Tri2BL.x - Rec2BR.x, 2) + Math.pow( Tri2BL.y - ( Rec2BR.y ) ,2 ) ), //R2BR
			 Math.sqrt( Math.pow(Tri2BL.x - HexB.x, 2) + Math.pow( Tri2BL.y - ( HexB.y ) ,2 ) ), //HB
	 };
	 Tri2BL.addBranch(T2BL[0], Tri2BR);
	 Tri2BL.addBranch(T2BL[1], Tri2T);
	 Tri2BL.addBranch(T2BL[2], Rec1TR);
	 Tri2BL.addBranch(T2BL[3], Rec1BR);
	 Tri2BL.addBranch(T2BL[4], TrapBL);
	 Tri2BL.addBranch(T2BL[5], Tri1T);
	 Tri2BL.addBranch(T2BL[6], HexBL);
	 Tri2BL.addBranch(T2BL[7], HexTL);
	 Tri2BL.addBranch(T2BL[8], Rec2BR);
	 Tri2BL.addBranch(T2BL[9], HexB);
	 Double T2BR[] = {	 
			 Math.sqrt( Math.pow(Tri2BR.x - Tri2T.x, 2) + Math.pow( Tri2BR.y - ( Tri2T.y ) ,2 ) ), //T2T
			 Math.sqrt( Math.pow(Tri2BR.x - Tri2BL.x, 2) + Math.pow( Tri2BR.y - ( Tri2BL.y ) ,2 ) ), //T2BL
			 Math.sqrt( Math.pow(Tri2BR.x - Rec2BL.x, 2) + Math.pow( Tri2BR.y - ( Rec2BL.y ) ,2 ) ), //R2BL
			 Math.sqrt( Math.pow(Tri2BR.x - Rec2BR.x, 2) + Math.pow( Tri2BR.y - ( Rec2BR.y ) ,2 ) ),// R2BR
			 Math.sqrt( Math.pow(Tri2BR.x - HexT.x, 2) + Math.pow( Tri2BR.y - ( HexT.y ) ,2 ) ), //HT
			 Math.sqrt( Math.pow(Tri2BR.x - HexTL.x, 2) + Math.pow( Tri2BR.y - ( HexTL.y ) ,2 ) ),// HTl
			 Math.sqrt( Math.pow(Tri2BR.x - HexBL.x, 2) + Math.pow( Tri2BR.y - ( HexBL.y ) ,2 ) ), //HBL
	 };
	 Tri2BR.addBranch(T2BR[0], Tri2T);
	 Tri2BR.addBranch(T2BR[1], Tri2BL);
	 Tri2BR.addBranch(T2BR[2], Rec2BL);
	 Tri2BR.addBranch(T2BR[3], Rec2BR);
	 Tri2BR.addBranch(T2BR[4], HexT);
	 Tri2BR.addBranch(T2BR[5], HexTL);
	 Tri2BR.addBranch(T2BR[6], HexBL);
	 
	 //Rec2
	 Double R2TR[] = {
			 Math.sqrt( Math.pow(Rec2x[2] - Rec2x[1], 2) + Math.pow( Rec2y[2] - ( Rec2y[1]) ,2 ) ), //R2TL
			 Math.sqrt( Math.pow(Rec2x[2] - Rec2x[3], 2) + Math.pow( Rec2y[2] - ( Rec2y[3]) ,2 ) ), //R2BR
			 Math.sqrt( Math.pow(Rec2x[2] - Polyx[2], 2) + Math.pow( Rec2y[2] - ( Polyy[2]) ,2 ) ), //PT
			 Math.sqrt( Math.pow(Rec2x[2] - Polyx[1], 2) + Math.pow( Rec2y[2] - ( Polyy[1]) ,2 ) ), //PTL
			 Math.sqrt( Math.pow(Rec2x[2] - Hexx[5], 2) + Math.pow( Rec2y[2] - ( Hexy[5]) ,2 ) ), //HT
			 Math.sqrt( Math.pow(Rec2x[2] - Hexx[4], 2) + Math.pow( Rec2y[2] - ( Hexy[4]) ,2 ) ), // HTR
			 Math.sqrt( Math.pow(Rec2TR.x - TrapTR.x, 2) + Math.pow( Rec2TR.y - ( TrapTR.y ) ,2 ) ), //TTR
	 };
	 Rec2TR.addBranch(R2TR[0], Rec2TL );
	 Rec2TR.addBranch(R2TR[1], Rec2BR);
	 Rec2TR.addBranch(R2TR[2], PolyT);
	 Rec2TR.addBranch(R2TR[3], PolyTL);
	 Rec2TR.addBranch(R2TR[4], HexT);
	 Rec2TR.addBranch(R2TR[5], HexTR);
	 Rec2TR.addBranch(R2TR[5], TrapTR);
	 Double R2TL[] = {
			 Math.sqrt( Math.pow(Rec2x[1] - Rec2x[2], 2) + Math.pow( Rec2y[1] - ( Rec2y[2]) ,2 ) ), //R2TR
			 Math.sqrt( Math.pow(Rec2x[1] - Rec2x[0], 2) + Math.pow( Rec2y[1] - ( Rec2y[0]) ,2 ) ), //R2BL
			 Math.sqrt( Math.pow(Rec2x[1] - Tri2x[0], 2) + Math.pow( Rec2y[1] - ( Tri2y[0]) ,2 ) ), //T2T
			 Math.sqrt( Math.pow(Rec2x[1] - Trapx[3], 2) + Math.pow( Rec2y[1] - ( Trapy[3]) ,2 ) ), //TBR
			 Math.sqrt( Math.pow(Rec2x[1] - Trapx[2], 2) + Math.pow( Rec2y[1] - ( Trapy[2]) ,2 ) ), //TTR		 
	 };
	 Rec2TL.addBranch(R2TL[0], Rec2TR);
	 Rec2TL.addBranch(R2TL[1], Rec2BL);
	 Rec2TL.addBranch(R2TL[2], Tri2T);
	 Rec2TL.addBranch(R2TL[3], TrapBR);
	 Rec2TL.addBranch(R2TL[4], TrapTR);
	 Double R2BL[] = {
			 Math.sqrt( Math.pow(Rec2BL.x - Rec2BR.x, 2) + Math.pow( Rec2BL.y - ( Rec2BR.y ) ,2 ) ), //R2BR
			 Math.sqrt( Math.pow(Rec2BL.x - Rec2TL.x, 2) + Math.pow( Rec2BL.y - ( Rec2TL.y ) ,2 ) ), //R2TL
			 Math.sqrt( Math.pow(Rec2BL.x - Tri2BR.x, 2) + Math.pow( Rec2BL.y - ( Tri2BR.y ) ,2 ) ), //T2BR
			 Math.sqrt( Math.pow(Rec2BL.x - Tri2T.x, 2) + Math.pow( Rec2BL.y - ( Tri2T.y ) ,2 ) ), //T2T
			 Math.sqrt( Math.pow(Rec2BL.x - TrapBL.x, 2) + Math.pow( Rec2BL.y - ( TrapBL.y ) ,2 ) ), //TBL
			 Math.sqrt( Math.pow(Rec2BL.x - TrapBR.x, 2) + Math.pow( Rec2BL.y - ( TrapBR.y ) ,2 ) ), //TBR
			 Math.sqrt( Math.pow(Rec2BL.x - HexT.x, 2) + Math.pow( Rec2BL.y - ( HexT.y ) ,2 ) ), //HT
			 Math.sqrt( Math.pow(Rec2BL.x - HexTL.x, 2) + Math.pow( Rec2BL.y - ( HexTL.y ) ,2 ) ), //HTL
			 Math.sqrt( Math.pow(Rec2BL.x - HexBL.x, 2) + Math.pow( Rec2BL.y - ( HexBL.y ) ,2 ) ), //HBL
	 };
	 Rec2BL.addBranch(R2BL[0], Rec2BR);
	 Rec2BL.addBranch(R2BL[1], Rec2TL);
	 Rec2BL.addBranch(R2BL[2], Tri2BR);
	 Rec2BL.addBranch(R2BL[3], Tri2T);
	 Rec2BL.addBranch(R2BL[4], TrapBL);
	 Rec2BL.addBranch(R2BL[5], TrapBR);
	 Rec2BL.addBranch(R2BL[6], HexT);
	 Rec2BL.addBranch(R2BL[7], HexTL);
	 Rec2BL.addBranch(R2BL[8], HexBL);
	 Double R2BR[] = {
			 Math.sqrt( Math.pow(Rec2x[3] - Rec2x[2], 2) + Math.pow( Rec2y[3] - ( Rec2y[2]) ,2 ) ), //R2TR
			 Math.sqrt( Math.pow(Rec2BR.x - Rec2BL.x, 2) + Math.pow( Rec2BR.y - ( Rec2BL.y ) ,2 ) ), //R2BL
			 Math.sqrt( Math.pow(Rec2BR.x - PolyTL.x, 2) + Math.pow( Rec2BR.y - ( PolyTL.y ) ,2 ) ), //PTL
			 Math.sqrt( Math.pow(Rec2BR.x - PolyB.x, 2) + Math.pow( Rec2BR.y - ( PolyB.y ) ,2 ) ), //PB
			 Math.sqrt( Math.pow(Rec2BR.x - HexT.x, 2) + Math.pow( Rec2BR.y - ( HexT.y ) ,2 ) ), //HT
			 Math.sqrt( Math.pow(Rec2BR.x - HexTL.x, 2) + Math.pow( Rec2BR.y - ( HexTL.y ) ,2 ) ), //HTL
			 Math.sqrt( Math.pow(Rec2BR.x - Tri2BR.x, 2) + Math.pow( Rec2BR.y - ( Tri2BR.y ) ,2 ) ), //T2BR
	 };
	 Rec2BR.addBranch(R2BR[0], Rec2TR);
	 Rec2BR.addBranch(R2BR[1], Rec2BL);
	 Rec2BR.addBranch(R2BR[2], PolyTL);
	 Rec2BR.addBranch(R2BR[3], PolyB);
	 Rec2BR.addBranch(R2BR[4], HexT);
	 Rec2BR.addBranch(R2BR[5], HexTL);
	 Rec2BR.addBranch(R2BR[6], Tri2BR);
	 //Hex
	 Double HBL[] = {
			 Math.sqrt( Math.pow(HexBL.x - HexB.x, 2) + Math.pow( HexBL.y - ( HexB.y ) ,2 ) ), //HB
			 Math.sqrt( Math.pow(HexBL.x - HexTL.x, 2) + Math.pow( HexBL.y - ( HexTL.y ) ,2 ) ), //HTL
			 Math.sqrt( Math.pow(HexBL.x - Tri2BR.x, 2) + Math.pow( HexBL.y - ( Tri2BR.y ) ,2 ) ), //T2BR
			 Math.sqrt( Math.pow(HexBL.x - Tri2BL.x, 2) + Math.pow( HexBL.y - ( Tri2BL.y ) ,2 ) ), //T2BL
			 Math.sqrt( Math.pow(HexBL.x - Rec1BR.x, 2) + Math.pow( HexBL.y - ( Rec1BR.y ) ,2 ) ), //R1BR
			 Math.sqrt( Math.pow(HexBL.x - Rec2BL.x, 2) + Math.pow( HexBL.y - ( Rec2BL.y ) ,2 ) ), //R2BL
	 };
	 HexBL.addBranch(HBL[0], HexB);
	 HexBL.addBranch(HBL[1], HexTL);
	 HexBL.addBranch(HBL[2], Tri2BR);
	 HexBL.addBranch(HBL[3], Tri2BL);
	 HexBL.addBranch(HBL[4], Rec1BR);
	 HexBL.addBranch(HBL[5], Rec2BL);
	 Double HB[] = {
			 Math.sqrt( Math.pow(HexB.x - HexBL.x, 2) + Math.pow( HexB.y - ( HexBL.y ) ,2 ) ), //HBL
			 Math.sqrt( Math.pow(HexB.x - HexBR.x, 2) + Math.pow( HexB.y - ( HexBR.y ) ,2 ) ), //HBR
			 Math.sqrt( Math.pow(HexB.x - Tri2BL.x, 2) + Math.pow( HexB.y - ( Tri2BL.y ) ,2 ) ), // T2BL
			 Math.sqrt( Math.pow(HexB.x - Rec1BR.x, 2) + Math.pow( HexB.y - ( Rec1BR.y ) ,2 ) ), //R1BR
	 };
	 HexB.addBranch(HB[0], HexBL);
	 HexB.addBranch(HB[1], HexBR);
	 HexB.addBranch(HB[2], Tri2BL);
	 HexB.addBranch(HB[3], Rec1BR);
	 Double HBR[] = {
			 Math.sqrt( Math.pow(HexBR.x - HexB.x, 2) + Math.pow( HexBR.y - ( HexB.y ) ,2 ) ), //HB
			 Math.sqrt( Math.pow(HexBR.x - HexTR.x, 2) + Math.pow( HexBR.y - ( HexTR.y ) ,2 ) ), //HTR
			 Math.sqrt( Math.pow(HexBR.x - PolyB.x, 2) + Math.pow( HexBR.y - ( PolyB.y ) ,2 ) ), //PB
	 };
	 HexBR.addBranch(HBR[0], HexB);
	 HexBR.addBranch(HBR[1], HexTR);
	 HexBR.addBranch(HBR[2], PolyB);
	 Double HTR[] = {
			 Math.sqrt( Math.pow(HexTR.x - HexT.x, 2) + Math.pow( HexTR.y - ( HexT.y ) ,2 ) ), //HT
			 Math.sqrt( Math.pow(HexTR.x - HexBR.x, 2) + Math.pow( HexTR.y - ( HexBR.y ) ,2 ) ), //HBR
			 Math.sqrt( Math.pow(HexTR.x - PolyB.x, 2) + Math.pow( HexTR.y - ( PolyB.y ) ,2 ) ),// PB
			 Math.sqrt( Math.pow(HexTR.x - Rec2TR.x, 2) + Math.pow( HexTR.y - ( Rec2TR.y ) ,2 ) ), //R2TR
	 };
	 HexTR.addBranch(HTR[0], HexT);
	 HexTR.addBranch(HTR[1], HexBR);
	 HexTR.addBranch(HTR[2], PolyB);
	 HexTR.addBranch(HTR[3], Rec2TR);
	 Double HT[] = {
			 Math.sqrt( Math.pow(HexT.x - HexTR.x, 2) + Math.pow( HexT.y - ( HexTR.y ) ,2 ) ), // HTR
			 Math.sqrt( Math.pow(HexT.x - HexTL.x, 2) + Math.pow( HexT.y - ( HexTL.y ) ,2 ) ), //HTL
			 Math.sqrt( Math.pow(HexT.x - PolyB.x, 2) + Math.pow( HexT.y - ( PolyB.y ) ,2 ) ), //PB
			 Math.sqrt( Math.pow(HexT.x - PolyTL.x, 2) + Math.pow( HexT.y - ( PolyTL.y ) ,2 ) ), //PTL
			 Math.sqrt( Math.pow(HexT.x - Rec2TR.x, 2) + Math.pow( HexT.y - ( Rec2TR.y ) ,2 ) ), //R2TR
			 Math.sqrt( Math.pow(HexT.x - Rec2BR.x, 2) + Math.pow( HexT.y - ( Rec2BR.y ) ,2 ) ), //R2BR
			 Math.sqrt( Math.pow(HexT.x - Rec2BL.x, 2) + Math.pow( HexT.y - ( Rec2BL.y ) ,2 ) ), //R2BL
			 Math.sqrt( Math.pow(HexT.x - Tri2BR.x, 2) + Math.pow( HexT.y - ( Tri2BR.y ) ,2 ) ), //T2BR
	 };
	 HexT.addBranch(HT[0], HexTR);
	 HexT.addBranch(HT[1], HexTL);
	 HexT.addBranch(HT[2], PolyB);
	 HexT.addBranch(HT[3], PolyTL);
	 HexT.addBranch(HT[4], Rec2TR);
	 HexT.addBranch(HT[5], Rec2BR);
	 HexT.addBranch(HT[6], Rec2BL);
	 HexT.addBranch(HT[7], Tri2BR);
	 Double HTL[] = {
			 Math.sqrt( Math.pow(HexTL.x - HexT.x, 2) + Math.pow( HexTL.y - ( HexT.y ) ,2 ) ), //HT
			 Math.sqrt( Math.pow(HexTL.x - HexBL.x, 2) + Math.pow( HexTL.y - ( HexBL.y ) ,2 ) ), //HBL
			 Math.sqrt( Math.pow(HexTL.x - Rec2BR.x, 2) + Math.pow( HexTL.y - ( Rec2BR.y ) ,2 ) ),// R2BR
			 Math.sqrt( Math.pow(HexTL.x - Rec2BL.x, 2) + Math.pow( HexTL.y - ( Rec2BL.y ) ,2 ) ), //R2BL
			 Math.sqrt( Math.pow(HexTL.x - Tri2BR.x, 2) + Math.pow( HexTL.y - ( Tri2BR.y ) ,2 ) ), //T2BR
			 Math.sqrt( Math.pow(HexTL.x - Tri2BL.x, 2) + Math.pow( HexTL.y - ( Tri2BL.y ) ,2 ) ), //T2BL
			 Math.sqrt( Math.pow(HexTL.x - Rec1BR.x, 2) + Math.pow( HexTL.y - ( Rec1BR.y ) ,2 ) ), //R1BR
	 };
	 HexTL.addBranch(HTL[0], HexT);
	 HexTL.addBranch(HTL[1], HexBL);
	 HexTL.addBranch(HTL[2], Rec2BR);
	 HexTL.addBranch(HTL[3], Rec2BL);
	 HexTL.addBranch(HTL[4], Tri2BR);
	 HexTL.addBranch(HTL[5], Tri2BL);
	 HexTL.addBranch(HTL[6], Rec1BR);
	 //Poly
	 Double PT[] = {
			 Math.sqrt( Math.pow(Polyx[2] - Polyx[1], 2) + Math.pow( Polyy[2] - ( Polyy[1]) ,2 ) ), //PTL
			 Math.sqrt( Math.pow(Polyx[2] - Polyx[3], 2) + Math.pow( Polyy[2] - ( Polyy[3]) ,2 ) ), //PTR
			 Math.sqrt( Math.pow(Polyx[2] - 997, 2) + Math.pow( Polyy[2] - ( h - 449) ,2 ) ), // goal
			 Math.sqrt( Math.pow(Polyx[2] - Rec2x[2], 2) + Math.pow( Polyy[2] - ( Rec2y[2]) ,2 ) ), //R2TR
			 Math.sqrt( Math.pow(PolyT.x - TrapTR.x, 2) + Math.pow( PolyT.y - ( TrapTR.y ) ,2 ) ), //TTR
	 };
	 PolyT.addBranch(PT[0], PolyTL);
	 PolyT.addBranch(PT[1], PolyTR);
	 PolyT.addBranch(PT[2], target);
	 PolyT.addBranch(PT[3], Rec2TR );
	 PolyT.addBranch(PT[4], TrapTR );
	 Double PTR[] = {
			 Math.sqrt( Math.pow(PolyTR.x -  PolyT.x, 2) + Math.pow( PolyTR.y - ( PolyT.y ) ,2 ) ), //PT
			 Math.sqrt( Math.pow(PolyTR.x - PolyB.x, 2) + Math.pow( PolyTR.y - ( PolyB.y ) ,2 ) ), //PB
			 Math.sqrt( Math.pow(PolyTR.x - target.x, 2) + Math.pow( PolyTR.y - ( target.y ) ,2 ) ), //target
	 };
	 PolyTR.addBranch(PTR[0], PolyT);
	 PolyTR.addBranch(PTR[1], PolyB);
	 PolyTR.addBranch(PTR[2], target);
	 Double PB[] = {
			 Math.sqrt( Math.pow(PolyB.x -  PolyTR.x, 2) + Math.pow( PolyB.y - ( PolyTR.y ) ,2 ) ), //PTR
			 Math.sqrt( Math.pow(PolyB.x -  PolyTL.x, 2) + Math.pow( PolyB.y - ( PolyTL.y ) ,2 ) ), //PTL
			 Math.sqrt( Math.pow(PolyB.x -  Rec2BR.x, 2) + Math.pow( PolyB.y - ( Rec2BR.y ) ,2 ) ), //R2BR
			 Math.sqrt( Math.pow(PolyB.x -  HexT.x, 2) + Math.pow( PolyB.y - ( HexT.y ) ,2 ) ), //HT
			 Math.sqrt( Math.pow(PolyB.x -  HexTR.x, 2) + Math.pow( PolyB.y - ( HexTR.y ) ,2 ) ), //HTR
			 Math.sqrt( Math.pow(PolyB.x -  HexBR.x, 2) + Math.pow( PolyB.y - ( HexBR.y ) ,2 ) ), //HBR
	 };
	 PolyB.addBranch(PB[0], PolyTR);
	 PolyB.addBranch(PB[1], PolyTL);
	 PolyB.addBranch(PB[2], Rec2BR);
	 PolyB.addBranch(PB[3], HexT);
	 PolyB.addBranch(PB[4], HexTR);
	 PolyB.addBranch(PB[5], HexBR);
	 Double PTL[] = {
			 Math.sqrt( Math.pow(PolyTL.x -  PolyT.x, 2) + Math.pow( PolyTL.y - ( PolyT.y ) ,2 ) ), //PT
			 Math.sqrt( Math.pow(PolyTL.x -  PolyB.x, 2) + Math.pow( PolyTL.y - ( PolyB.y ) ,2 ) ), //PB
			 Math.sqrt( Math.pow(PolyTL.x -  Rec2TR.x, 2) + Math.pow( PolyTL.y - ( Rec2TR.y ) ,2 ) ), //R2TR
			 Math.sqrt( Math.pow(PolyTL.x -  Rec2BR.x, 2) + Math.pow( PolyTL.y - ( Rec2BR.y ) ,2 ) ), //R2BR
			 Math.sqrt( Math.pow(PolyTL.x -  HexT.x, 2) + Math.pow( PolyTL.y - ( HexT.y ) ,2 ) ), //HT
	 };
	 PolyTL.addBranch(PTL[0], PolyT);
	 PolyTL.addBranch(PTL[1], PolyB);
	 PolyTL.addBranch(PTL[2], Rec2TR);
	 PolyTL.addBranch(PTL[3], Rec2BR);
	 PolyTL.addBranch(PTL[4], HexT);
	 
	 Node start = Node.aStar(head, target);
	 ArrayList<Node> path = Node.printPath(start);
	 
	 
	 
	 
  // create frame for PolygonsJPanel
  JFrame frame = new JFrame( "Drawing Polygons" );
  frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  PolygonsJPanel polygonsJPanel = new PolygonsJPanel(path);
  frame.add( polygonsJPanel ); // add polygonsJPanel to frame
  frame.setSize( 1500, 1000 ); // set frame size
  frame.setVisible( true ); // display frame
 } // end main
}

// draw polygons and polylines 
class PolygonsJPanel extends JPanel{
	
	protected static ArrayList<Node> pathlist;
    public PolygonsJPanel(ArrayList<Node> path){
        PolygonsJPanel.pathlist = path;
   }
 public void paintComponent( Graphics g ) {
	 
  super.paintComponent( g ); // call superclass's paintComponent
  int h = getHeight(); //h = 961
  
  int Rec1x[] = {230,  230, 600, 600  }; 
  int Rec1y[] = {h-131, h-21, h-21, h-131 }; 
  Polygon Rec1 = new Polygon( Rec1x, Rec1y, 4 ); 
  g.drawPolygon(Rec1);
     
  int Penta1x[] = {337, 214, 191, 324, 411};
  int Penta1y[] = {h - 193, h - 219, h - 345, h- 464, h - 344};
  Polygon Penta1 = new Polygon( Penta1x, Penta1y, 5);
  g.drawPolygon(Penta1);
  
  int Tri1x[] = {413, 466, 518};
  int Tri1y[] = {h - 185, h - 367, h - 185};
  Polygon Tri1 = new Polygon( Tri1x, Tri1y, 3);
  g.drawPolygon(Tri1);
  
  int Trapx[] = {524, 526, 615, 680};
  int Trapy[] = {h - 310, h - 452, h - 464, h - 399};
  Polygon Trap = new Polygon( Trapx, Trapy, 4);
  g.drawPolygon(Trap);
  
  int Tri2x[] = {617, 655, 732};
  int Tri2y[] = {h - 248, h - 80, h - 152};
  Polygon Tri2 = new Polygon ( Tri2x, Tri2y, 3);
  g.drawPolygon(Tri2);
  
  int Rec2x[] = {703, 703, 856, 856};
  int Rec2y[] = {h - 213,h -  451, h - 451, h - 213};
  Polygon Rec2 = new Polygon ( Rec2x, Rec2y, 4);
  g.drawPolygon(Rec2);
  
  int Hexx[] = {792, 792, 863, 938, 938, 876};
  int Hexy[] = {h - 143, h - 55, h - 15,h -  55, h - 143, h - 195};
  Polygon Hex = new Polygon( Hexx, Hexy, 6);
  g.drawPolygon(Hex);
  
  int Polyx[] = {954, 879, 930, 975};
  int Polyy[] = {h - 181,h - 420, h - 455, h - 410};
  Polygon Poly = new Polygon( Polyx, Polyy, 4);
  g.drawPolygon(Poly);
  
  
  //start is 199, h - 71
  //goal is 997,h - 449
  double Line = Math.sqrt( Math.pow(199 - 997, 2) + Math.pow( (h - 71) - ( h -449) ,2 ) );
  g.fillOval(199, h - 71, 10, 10);
  g.fillOval(997, h - 449, 10, 10);
  
  for(int i=0;i<pathlist.size()-1;i++) {
	 g.drawLine(pathlist.get(i).x , pathlist.get(i).y, pathlist.get(i+ 1).x, pathlist.get(i+1).y);
     }
  
  
 } // end method paintComponent
} // end class PolygonsJPanel