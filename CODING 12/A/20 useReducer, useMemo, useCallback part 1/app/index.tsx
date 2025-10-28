import React, { useReducer } from "react";
import { Button, FlatList, Text, View } from "react-native";
const initialState = {
  cart: [],
};
function reducer(state, action) {
  switch (action.type) {
    case "ADD_TO_CART":
      return { ...state, cart: [...state.cart, action.cart] };
    case "REMOVE_FROM_CART":
      return {
        ...state,
        cart: state.cart.filter((item) => item.id !== action.id),
      };
    case "CLEAR_CART":
      return { ...state, cart: [] };
    default:
      return state;
  }
}
const products = [
  { id: 1, name: "buku", harga: 5000 },
  { id: 2, name: "pena", harga: 6000 },
  { id: 3, name: "pencil", harga: 2700 },
  { id: 4, name: "penggaris", harga: 5500 },
];

export default function addCart() {
  const [state, dispatch] = useReducer(reducer, initialState);
  return (
    <View>
      <Text>Produk Tersedia</Text>
      <FlatList
        data={products}
        keyExtractor={(item) => item.id.toString()}
        renderItem={({ item }) => (
          <View>
            <Text>
              {" "}
              {item.name} - Rp{item.harga}
            </Text>
            <Button
              title="Tambah ke keranjang"
              onPress={() => dispatch({ type: "ADD_TO_CART", item })}
            />
          </View>
        )}
      />
      <Text> Keranjang : {state.cart.length} Item </Text>
    </View>
  );
}
