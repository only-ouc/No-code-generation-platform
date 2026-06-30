<script setup lang="ts">
import GlobalHeader from '@/components/GlobalHeader.vue'
import GlobalFooter from '@/components/GlobalFooter.vue'
</script>

<template>
  <a-layout class="basic-layout">
    <a-layout-header class="basic-layout-header">
      <GlobalHeader />
    </a-layout-header>
    <a-layout-content class="basic-layout-content">
      <router-view />
    </a-layout-content>
    <a-layout-footer class="basic-layout-footer">
      <GlobalFooter />
    </a-layout-footer>
  </a-layout>
</template>

<style scoped>
.basic-layout {
  min-height: 100vh;
}

.basic-layout-header {
  position: sticky;
  top: 0;
  z-index: 100;
  display: flex;
  align-items: center;
  padding: 0;
  background: #fff;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.06);
}

.basic-layout-content {
  flex: 1;
  padding: 24px;
  background: #f5f5f5;
}

.basic-layout-footer {
  padding: 0;
  background: #f0f2f5;
}
</style>
