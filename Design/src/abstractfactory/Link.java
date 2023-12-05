package abstractfactory;

public abstract class Link extends Item{
	
	private String url;//여기서만 쓰니까 그냥 private ->get터 맞들어주자
	
	public String getUrl() {
		return url;
	}
	
	@Override
	public abstract String makeHTML();
	
	
	
}
