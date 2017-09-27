
public class CommonHandset extends Handset implements PlayWiring,Network,ShiPin{
	public CommonHandset(String pinpai, String xinghao) {
		super(pinpai, xinghao);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void shipin() {
		System.out.println("视频通话开启");
		
	}

	@Override
	public void wang() {
		System.out.println("已经启动移动网络");
		
	}

	@Override
	public void bofang() {
		System.out.println("播放音乐《千里之外》");
		
	}


}
