import { Stack } from "expo-router";

export default function Layout() {
  return (
    <Stack
      screenOptions={{
        headerStyle: { backgroundColor: "#31fc53ff" },
        headerTintColor: "#585858ff",
        headerTitle: "Tester",
        headerTitleStyle: { fontWeight: "bold" },
      }}
    />
  );
}
