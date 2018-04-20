$(function(){
	
	switch(menu)
	{
	
	case'About Us':
		$('#about').addClass('active');
		break;
	case'Contact us':
		$('#contact').addClass('active');
		break;
		
	case'All Products':
		$('#listproducts').addClass('active');
		
		break;
		
	default:

		if (menu == "Home")
			break;
		$('#listproducts').addClass('active');
		$('#a_'+menu).addClass('active');
	break;
	}
	
	
	var products=[
		
		['1','ABC'],
		
		['2','ABC2'],
		
		['3','ABC3'],
		['4','ABC4'],
		['5','ABC5'],
		['6','ABC6'],
		['7','ABC7'],
		['8','ABC8'],
	];
	
	var $table = $('#productListTable');
	
	
	if($table.length)
	{
		console.log('inside the table');
		$table.DataTable({
			lengthMenu:[[3,5,10,-1],['3 Records','5-Records','10-Records','All']],
			data:products
			
		});
		}	
	
});
