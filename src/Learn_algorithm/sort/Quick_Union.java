package Learn_algorithm.sort;

/**
 * Created by Administrator on 2017/3/29.
 */
//加权quick_union算法
public class Quick_Union {
    private int[] id;
    private int[] size;//各个根节点对应的分量的大小
    private int count;//联通分量的个数
    public Quick_Union(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
        size = new int[N];
        for (int i = 0; i < N; i++){
            size[i] = 1;
        }
    }

    public boolean connected(int p, int q){
        return find(p) == find(q);
    }

    public int find(int p){
        while (p != id[p]){
            //            p = id[p];
            //将p节点的父亲节点设置为他的爷爷节点（将树展开，进行优化）
            id[p] = id[id[p]];
            p = id[p];
        }

        return p;
    }

    public void union(int p, int q){
        int i = find(p);
        int j = find(q);
        if(i == j)
            return;
        if(size[i] < size[j]){
            id[i] = j;
            size[j] = size[j] + size[i];
        }
        else {
            id[j] = i;
            size[i] = size[i] + size[j];
        }
        count--;
    }

    public static void main(String[] args){

    }
}
