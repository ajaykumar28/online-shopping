/**
 * 
 */
package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

/**
 * @author Ajay Kumar
 *
 */
@Repository("categoryDAO")
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
		
		Category category1 =new Category();
		category1.setId(2);
		category1.setName("mobile");
		category1.setDescription("this is discription for mobile");
		category1.setImageURL("CAT_2.png");
		
		categories.add(category1);
		Category category2 =new Category();
		/////////333
		category2.setId(3);
		category2.setName("laptop");
		category2.setDescription("this is discription for laptop");
		category2.setImageURL("CAT_3.png");
		categories.add(category2);
		
		
	
		
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	@Override
	public Category get(int id) {
		for(Category cat: categories)
		{
			if(cat.getId()==id)
				return cat;
		}
		return null;
	}

}
