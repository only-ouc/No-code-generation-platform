<script setup lang="ts">
const year = new Date().getFullYear()
</script>

<template>
  <div class="global-footer">
    <span>
      © {{ year }}
      <a href="https://github.com/only-ouc/No-code-generation-platform" target="_blank" rel="noopener noreferrer">
        AI 应用生成平台
      </a>
    </span>
  </div>
</template>

<style scoped>
.global-footer {
  text-align: center;
  padding: 16px 24px;
  color: rgba(0, 0, 0, 0.45);
  font-size: 14px;
}

.global-footer a {
  color: rgba(0, 0, 0, 0.45);
  text-decoration: none;
  transition: color 0.3s;
}

.global-footer a:hover {
  color: #1890ff;
}
</style>
