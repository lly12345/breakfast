package Test;

import java.io.File;

public class ClearFile {
	static int iFile = 0;
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
        // dir_str清理文件夹的路径 
        String dir_str = "D:\\文件名字";
        File dir = new File( dir_str );
        clear( dir );
        System.out.println( "清理成功。" );
        System.out.println( "共清理了" + iFile + "个空文件夹" );
	}
	
	public static void clear( File dir )
    {
        File[] dirs = dir.listFiles();
        for( int i = 0; i < dirs.length; i++ )
        {
            if( dirs[i].isDirectory() )
            {
                clear( dirs[i] );
            }
        }
        if( dir.isDirectory() && dir.delete() )
            iFile++;
        System.out.println( dir + "清理成功" );
 
    }


}
