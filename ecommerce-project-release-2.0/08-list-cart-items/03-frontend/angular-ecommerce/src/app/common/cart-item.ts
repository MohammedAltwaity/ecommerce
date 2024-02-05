import { Product } from "./product";

export class CartItem {

    id: string;
    name: string;
    imageUrl: string;
    unitPrice: number;

    quantity: number;

    constructor(product: Product) {
        // Check if product.id is defined, and provide a default value if it's not
        this.id = product.id || '';
        this.name = product.name || '';
        this.imageUrl = product.imageUrl || '';
        this.unitPrice = product.unitPrice || 0;
        this.quantity = 1;
    }

}
