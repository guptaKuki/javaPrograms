package Learn_HashMap;

import java.util.ArrayList;

public class Map<k,v> {
	
	ArrayList<MapNode<k,v>> buckets;
	int count;
	int numbuckets;
	
	public Map(){
		buckets= new ArrayList<>();
		numbuckets=20;
		for( int i=0;i<numbuckets;i++)
			buckets.add(null);
	}

	private int getBucketIndex(k key) {
		int hc= key.hashCode();
		return hc%numbuckets;
	}
	
	public void insert(k key , v value) {
		int bucketIndex=getBucketIndex(key);
		
		MapNode<k,v> head=buckets.get(bucketIndex);
		// if element is present then update
		while(head != null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		// if element is not present then insert
		head= buckets.get(bucketIndex);
		MapNode<k,v> newNode= new MapNode<>(key,value);
		newNode.next=head;
		buckets.set(bucketIndex, newNode);
		count++;
		
		double loadFactor= (1.0*count)/numbuckets;
		if(loadFactor > 0.7)
			reHash();
	}
	
	public int size() {
		return count;
	}
	
	public v getValue(k key) {
		int index=getBucketIndex(key);
		MapNode<k,v> head=buckets.get(index);
		while(head != null) {
			if(head.key.equals(key))
				return head.value;
			head=head.next;
		}
		return null;
	}
	
	public boolean remove(k key) {
		int index=getBucketIndex(key);
		MapNode<k,v> head= buckets.get(index);
		MapNode<k,v>  prev=null;
		while(head != null) {
			if(head.key.equals(key)) {
				if(prev != null) {
				prev.next=head.next;
				count--;
				return true;
				}else {
					buckets.set(index, head.next);
					count--;
					return true;
				}
			}
			prev=head;
			head=head.next;
		}
		return false;
	}
	
	private void reHash() {
		ArrayList<MapNode<k,v>> temp=buckets;
		buckets=new ArrayList<>();
		for(int i=0;i<2*numbuckets;i++)
			buckets.add(null);
		
		for( int i=0;i<temp.size();i++) {
			MapNode<k,v> head= temp.get(i);
			while(head != null) {
				k key=head.key;
				v value=head.value;
				insert(key,value);
				head=head.next;
			}
		}
	}
}
