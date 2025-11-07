import React from "react";
import { View } from "react-native";
import Home from "./Home";
import { ThemeProvider } from "./ThemeContext";

function AppContent() {
  return <View style={{ flex: 1 }}>{<Home />}</View>;
}

export default function Index() {
  return (
    <ThemeProvider>
      <AppContent />
    </ThemeProvider>
  );
}
