package com.lun.swordtowardoffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import com.lun.swordtowardoffer.FindLastCommonParent.TreeNode;
import com.lun.util.MyUtils;

public class FindLastCommonParentTest {

	@Test
	public void testGetPath() {
		FindLastCommonParent fp = new FindLastCommonParent();
		TreeNode root = makeATree();
		
		List<Character> list = fp.getPath(root, 'F').stream()
				.map(a->a.value).collect(Collectors.toList());
		Assert.assertThat(list, CoreMatchers.is(Arrays.asList('A','B','D','F')));
		
		List<Character> list2 = fp.getPath(root, 'H').stream()
				.map(a->a.value).collect(Collectors.toList());
		Assert.assertThat(list2, CoreMatchers.is(Arrays.asList('A','B','E','H')));
		
		List<Character> list3 = fp.getPath(root, 'Z').stream()
				.map(a->a.value).collect(Collectors.toList());
		Assert.assertTrue(MyUtils.checkListEmpty(list3));
		
		List<Character> list4 = fp.getPath(root, 'E').stream()
				.map(a->a.value).collect(Collectors.toList());
		Assert.assertThat(list4, CoreMatchers.is(Arrays.asList('A','B','E')));
		
		List<Character> list5 = fp.getPath(root, 'C').stream()
				.map(a->a.value).collect(Collectors.toList());
		Assert.assertThat(list5, CoreMatchers.is(Arrays.asList('A','C')));
		
		List<Character> list6 = fp.getPath(root, 'J').stream()
				.map(a->a.value).collect(Collectors.toList());
		Assert.assertThat(list6, CoreMatchers.is(Arrays.asList('A','B','E','J')));
	}
	
	@Test
	public void testGetPath2() {
		FindLastCommonParent fp = new FindLastCommonParent();
		TreeNode root = makeATree();
		
		List<TreeNode> list = new ArrayList<>();
		fp.getPath(root, 'F', list);
		List<Character> list2 = list.stream().map(a->a.value).collect(Collectors.toList());
		Assert.assertThat(list2, CoreMatchers.is(Arrays.asList('A','B','D','F')));
		
		list = new ArrayList<>();
		fp.getPath(root, 'H', list);
		list2 = list.stream().map(a->a.value).collect(Collectors.toList());
		Assert.assertThat(list2, CoreMatchers.is(Arrays.asList('A','B','E','H')));

		list = new ArrayList<>();
		fp.getPath(root, 'Z', list);
		list2 = list.stream().map(a->a.value).collect(Collectors.toList());
		Assert.assertTrue(MyUtils.checkListEmpty(list2));

		list = new ArrayList<>();
		fp.getPath(root, 'E', list);
		list2 = list.stream().map(a->a.value).collect(Collectors.toList());
		Assert.assertThat(list2, CoreMatchers.is(Arrays.asList('A','B','E')));
		
		list = new ArrayList<>();
		fp.getPath(root, 'C', list);
		list2 = list.stream().map(a->a.value).collect(Collectors.toList());
		Assert.assertThat(list2, CoreMatchers.is(Arrays.asList('A','C')));
		
		list = new ArrayList<>();
		fp.getPath(root, 'J', list);
		list2 = list.stream().map(a->a.value).collect(Collectors.toList());
		Assert.assertThat(list2, CoreMatchers.is(Arrays.asList('A','B','E','J')));
	}
	
	@Test
	public void testFindLastCommonParent() {
		FindLastCommonParent fp = new FindLastCommonParent();
		
		List<TreeNode> list1 = Arrays.asList('A','B','D','F')
				.stream().map(a->new TreeNode(a, null)).collect(Collectors.toList());
		List<TreeNode> list2 = Arrays.asList('A','B','E','H')
				.stream().map(a->new TreeNode(a, null)).collect(Collectors.toList());
		
		Assert.assertEquals('B', fp.findLastCommonParent(list1, list2).value);
		
	}
	
	@Test
	public void testFind() {
		FindLastCommonParent fp = new FindLastCommonParent();
		TreeNode root = makeATree();
		TreeNode node = fp.find(root, 'F', 'H');
		Assert.assertEquals('B', node.value);
	}
	
	private TreeNode makeATree() {
		TreeNode root = new TreeNode('A', new ArrayList<>());
		
		TreeNode node1 = new TreeNode('B', new ArrayList<>());
		TreeNode node2 = new TreeNode('C', new ArrayList<>());
		
		root.children.add(node1);
		root.children.add(node2);
		
		TreeNode node3 = new TreeNode('D', new ArrayList<>());
		TreeNode node4 = new TreeNode('E', new ArrayList<>());
		
		node1.children.add(node3);
		node1.children.add(node4);
		
		TreeNode node5 = new TreeNode('F', null);
		TreeNode node6 = new TreeNode('G', null);
		
		node3.children.add(node5);
		node3.children.add(node6);
		
		TreeNode node7 = new TreeNode('H', null);
		TreeNode node8 = new TreeNode('I', null);
		TreeNode node9 = new TreeNode('J', null);
		
		node4.children.add(node7);
		node4.children.add(node8);
		node4.children.add(node9);
		
		return root;
	}
	
	
}
