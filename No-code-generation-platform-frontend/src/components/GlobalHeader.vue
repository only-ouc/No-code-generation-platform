<script setup lang="ts">
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import type { MenuProps } from 'ant-design-vue'

const router = useRouter()
// 当前选中菜单
const selectedKeys = ref<string[]>(['/'])
// 监听路由变化，更新当前选中菜单
router.afterEach((to) => {
  selectedKeys.value = [to.path]
})

// 菜单配置
const items = [
  { key: '/', label: '首页' },
  { key: '/about', label: '关于' },
]

// 处理菜单点击
const handleMenuClick: MenuProps['onClick'] = (e) => {
  const key = e.key as string
  selectedKeys.value = [key]
  // 跳转到对应页面
  if (key.startsWith('/')) {
    router.push(key)
  }
}
</script>

<template>
  <div class="global-header">
    <div class="header-logo">
      <img src="@/assets/GPT Image.png" alt="logo" class="logo-img" />
      <span class="site-title">AI 应用生成平台</span>
    </div>
    <a-menu
      v-model:selectedKeys="selectedKeys"
      mode="horizontal"
      :items="items"
      class="header-menu"
      @click="handleMenuClick"
    />
    <div class="header-actions">
      <a-button>登录</a-button>
    </div>
  </div>
</template>

<style scoped>
.global-header {
  display: flex;
  align-items: center;
  justify-content: space-between;
  width: 100%;
  padding: 0 24px;
}

.header-logo {
  display: flex;
  align-items: center;
  gap: 12px;
  flex-shrink: 0;
}

.logo-img {
  width: 40px;
  height: 40px;
  object-fit: contain;
}

.site-title {
  font-size: 18px;
  font-weight: 600;
  color: #333;
  white-space: nowrap;
}

.header-menu {
  flex: 1;
  min-width: 0;
  margin: 0 24px;
  border-bottom: none;
  line-height: 64px;
}

.header-actions {
  flex-shrink: 0;
}

@media (max-width: 768px) {
  .site-title {
    display: none;
  }

  .header-menu {
    margin: 0 12px;
    font-size: 14px;
  }
}
</style>
