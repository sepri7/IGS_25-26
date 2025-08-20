import { Stack } from 'expo-router';

export default function Layout() {
  // return <Stack />;
  return <Stack screenOptions={{ headerShown: false }} />;
}




// import { Stack } from "expo-router";
// import { View, StyleSheet } from "react-native";
// import Navbar from "../components/Navbar";

// export default function Layout() {
//   return (
//     <View style={styles.container}>
//       <Stack screenOptions={{ headerShown: false }} />
//       <Navbar />
//     </View>
//   );
// }

// const styles = StyleSheet.create({
//   container: {
//     flex: 1,
//     paddingBottom: 60, // cukup untuk memberi ruang navbar
//   },
// });

