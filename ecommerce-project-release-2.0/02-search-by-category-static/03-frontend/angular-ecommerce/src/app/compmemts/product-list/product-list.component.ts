import { Component, OnInit } from '@angular/core';
import { ProductService } from '../../services/product.service';
import { Product } from '../../common/product';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-list',

  templateUrl: './product-list-grid.component.html',
  styleUrl: './product-list.component.css'
})
export class ProductListComponent implements OnInit {

  products: Product[] = [];
  currentCategoryId: number = 1;
  constructor(private productService: ProductService,
    private route: ActivatedRoute) { }


  // ...

  ngOnInit(): void {
    this.route.paramMap.subscribe(() => {
      this.listProducts();
    });
  }

  listProducts() {
    // Get the "id" parameter from the route
    const categoryIdParam = this.route.snapshot.paramMap.get("id");

    // Check if categoryIdParam is truthy (not null or undefined)
    if (categoryIdParam) {
      // Convert categoryIdParam to a number using the '+' symbol
      this.currentCategoryId = +categoryIdParam;
    } else {
      // Set a default value; you can choose any value you want
      this.currentCategoryId = 1;
    }

    // get products for the given category id
    this.productService.getProductList(this.currentCategoryId).subscribe(
      data => {
        this.products = data;
      }
    );
  }

  // ...



}
