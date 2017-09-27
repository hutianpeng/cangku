
public abstract class Handset {
        String pinpai;
        String xinghao;
        public void show(){
        	System.out.printf("这是一款型号为%s的%s手机:\n",xinghao,pinpai);
        }
		public Handset(String pinpai, String xinghao) {
			super();
			this.pinpai = pinpai;
			this.xinghao = xinghao;
		}
        
}
