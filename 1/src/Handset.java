
public abstract class Handset {
        String pinpai;
        String xinghao;
        public void show(){
        	System.out.printf("����һ���ͺ�Ϊ%s��%s�ֻ�:\n",xinghao,pinpai);
        }
		public Handset(String pinpai, String xinghao) {
			super();
			this.pinpai = pinpai;
			this.xinghao = xinghao;
		}
        
}
