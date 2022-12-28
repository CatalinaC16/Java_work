package pb6_1;

public class CalendarLucru {

	protected Zi[] zile = new Zi[7];

	public void Calendar(boolean z1, boolean z2, boolean z3,boolean z4,boolean z5,boolean z6,boolean z7) {
		zile[0]= new Zi("Luni",z1);
		zile[1]= new Zi("Marti",z2);
		zile[2]= new Zi("Miercuri",z3);
		zile[3]= new Zi("Joi",z4);
		zile[4]= new Zi("Vineri",z5);
		zile[5]= new Zi("Sambata",z6);
		zile[6]= new Zi("Duminica",z7);
		
		
	}
	public CalendarLucru(boolean z1, boolean z2, boolean z3,boolean z4,boolean z5,boolean z6,boolean z7) {
		super();	
		Calendar(z1,z2,z3,z4,z5,z6,z7);
	}
    	
	public Zi[] getZile() {
		return zile;
	}

	public void setZile(Zi[] zile) {
		this.zile = zile;
	}

	public boolean lucra(String zi) {
		for(int i=0; i<6;i++) {
			if(zile[i].getNume().equalsIgnoreCase(zi))
			{
				if(zile[i].isLucratoare())
					return true;
				else
					return false;
			}
				
		}
		return false;
	
	}
    
	
	
	
}
