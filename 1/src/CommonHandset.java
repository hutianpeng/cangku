
public class CommonHandset extends Handset implements PlayWiring,Network,ShiPin{
	public CommonHandset(String pinpai, String xinghao) {
		super(pinpai, xinghao);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void shipin() {
		System.out.println("��Ƶͨ������");
		
	}

	@Override
	public void wang() {
		System.out.println("�Ѿ������ƶ�����");
		
	}

	@Override
	public void bofang() {
		System.out.println("�������֡�ǧ��֮�⡷");
		
	}


}
