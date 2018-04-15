/**
 * 
 */
package net.kzn.shoppingbackend.impl;

import java.util.ArrayList;
import java.util.List;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

/**
 * @author Ajay Kumar
 *
 */
public class CategoryDAOImpl implements CategoryDAO {

	/* (non-Javadoc)
	 * @see net.kzn.shoppingbackend.dao.CategoryDAO#list()
	 */
	
private static	List<Category> categories =new ArrayList<>();
	static {
////////////1111111
		Category category =new Category();
		category.setId(1);
		category.setName("telivision");
		category.setDescription("this is discription for telivision");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		////////2222222
		
		
		category.setId(2);
		category.setName("mobile");
		category.setDescription("this is discription for mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		/////////333
		category.setId(3);
		category.setName("laptop");
		category.setDescription("this is discription for laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
		
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
