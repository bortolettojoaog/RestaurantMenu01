import React from 'react';

type Product = {
    id: number;
    title: string;
    description: string;
    image: string;
    price: number;
};

const products: Product[] = [
    {
        id: 1,
        title: 'Product 1',
        description: 'Produto 01.',
        image: 'https://via.placeholder.com/300',
        price: 100,
    },
    {
        id: 2,
        title: 'Product 2',
        description: 'Produto 02.',
        image: 'https://via.placeholder.com/300',
        price: 200,
    },
    {
        id: 3,
        title: 'Product 3',
        description: 'Produto 03.',
        image: 'https://via.placeholder.com/300',
        price: 300,
    },
];

const Home: React.FC = () => {
    return (
        <section className="home-page min-h-screen flex items-center justify-center bg-gray-900">
            <div className="container mx-auto p-4">
                <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
                    {products.map((product) => (
                        <div
                            key={product.id}
                            className="card bg-white shadow-md rounded-lg overflow-hidden"
                        >
                            <img
                                src={product.image}
                                alt="Product"
                                className="w-full h-48 object-cover"
                            />
                            <div className="p-4">
                                <h2 className="text-xl font-bold mb-2">{product.title}</h2>
                                <p className="text-gray-700 mb-4">{product.description}</p>
                                <div className="flex justify-between">
                                    <button className="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600">
                                        Details
                                    </button>
                                    <button className="bg-green-500 text-white px-4 py-2 rounded hover:bg-green-600">
                                        Buy
                                    </button>
                                </div>
                            </div>
                        </div>
                    ))}
                </div>
            </div>
        </section>
    );
};

export default Home;
